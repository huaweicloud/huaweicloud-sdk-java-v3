package com.huaweicloud.sdk.core.auth;

import java.util.Arrays;
import java.util.List;

public abstract class AbstractCredentials implements ICredential {

    private String ak;

    private String sk;

    private final List<String> sensitiveHeaders
            = Arrays.asList("authorization", "x-auth-token", "x-subject-token", "x-service-token");

    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }

    @Override
    public List<String> getSensitiveHeaders() {
        return sensitiveHeaders;
    }

}
