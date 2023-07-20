package com.idrbt.payload;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "banking")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String source_account;
    private String dest_account;
    private double txn_account;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSource_account() {
        return source_account;
    }

    public void setSource_account(String source_account) {
        this.source_account = source_account;
    }

    public String getDest_account() {
        return dest_account;
    }

    public void setDest_account(String dest_account) {
        this.dest_account = dest_account;
    }

    public double getTxn_account() {
        return txn_account;
    }

    public void setTxn_account(double txn_account) {
        this.txn_account = txn_account;
    }
}
