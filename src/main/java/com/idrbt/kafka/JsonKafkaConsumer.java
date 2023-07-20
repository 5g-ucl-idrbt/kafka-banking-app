package com.idrbt.kafka;


import com.idrbt.payload.User;
import com.idrbt.repository.BankingDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    private BankingDataRepository bankingDataRepository;

    public JsonKafkaConsumer(BankingDataRepository bankingDataRepository) {
        this.bankingDataRepository = bankingDataRepository;
    }

    @KafkaListener(topics = "idrbt_json", groupId = "myGroup")
    public void consume(User user){
        LOGGER.info(String.format("Json message recieved -> %s", user.toString()));
        // saving the data in mysql DB
          bankingDataRepository.save(user);
    }
}
