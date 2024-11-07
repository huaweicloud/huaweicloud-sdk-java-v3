package com.huaweicloud.sdk.kvs.v1.model;

public class Credential {
    String ak;

    String sk;

    String stsToken;

    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public Credential withAk(String ak) {
        this.ak = ak;
        return this;
    }

    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }

    public Credential withSk(String sk) {
        this.sk = sk;
        return this;
    }

    public String getStsToken() {
        return stsToken;
    }

    public void setStsToken(String stsToken) {
        this.stsToken = stsToken;
    }

    public Credential withStsToken(String stsToken) {
        this.stsToken = stsToken;
        return this;
    }
}
