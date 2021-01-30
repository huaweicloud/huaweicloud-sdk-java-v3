package com.huaweicloud.sdk.core.auth;

public class EnvCredentials {
    public static final String AK_ENV_NAME = "HUAWEICLOUD_SDK_AK";
    public static final String SK_ENV_NAME = "HUAWEICLOUD_SDK_SK";
    public static final String PROJECT_ID_ENV_NAME = "HUAWEICLOUD_SDK_PROJECT_ID";
    public static final String DOMAIN_ID_ENV_NAME = "HUAWEICLOUD_SDK_DOMAIN_ID";

    public static final String BASIC_CREDENTIAL_TYPE = "BasicCredentials";
    public static final String GLOBAL_CREDENTIAL_TYPE = "GlobalCredentials";

    /**
     * Notice: Function `LoadCredentialFromEnv` is only able to load BasicCredentials and GlobalCredentials.
     *
     * @param defaultType default credential type from ClientBuilder
     * @return instance of ICredential
     */
    public static ICredential loadCredentialFromEnv(String defaultType) {
        String ak = System.getenv(AK_ENV_NAME);
        String sk = System.getenv(SK_ENV_NAME);

        if (BASIC_CREDENTIAL_TYPE.equals(defaultType)) {
            String projectId = System.getenv(PROJECT_ID_ENV_NAME);
            return new BasicCredentials().withAk(ak).withSk(sk).withProjectId(projectId);
        } else if (GLOBAL_CREDENTIAL_TYPE.equals(defaultType)) {
            String domainId = System.getenv(DOMAIN_ID_ENV_NAME);
            return new GlobalCredentials().withAk(ak).withSk(sk).withDomainId(domainId);
        } else {
            return null;
        }
    }

}
