package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 资源的类型。 - iam:agency：IAM委托 - iam:user：IAM用户 - kms:cmk：DEW共享密钥 - obs:bucket：OBS桶 - swr:repo：SWR镜像仓库 - cbr:backup：CBR备份 - ims:image：IMS镜像 
 */
public class ResourceType {

    /**
     * Enum IAM_AGENCY for value: "iam:agency"
     */
    public static final ResourceType IAM_AGENCY = new ResourceType("iam:agency");

    /**
     * Enum IAM_USER for value: "iam:user"
     */
    public static final ResourceType IAM_USER = new ResourceType("iam:user");

    /**
     * Enum KMS_CMK for value: "kms:cmk"
     */
    public static final ResourceType KMS_CMK = new ResourceType("kms:cmk");

    /**
     * Enum OBS_BUCKET for value: "obs:bucket"
     */
    public static final ResourceType OBS_BUCKET = new ResourceType("obs:bucket");

    /**
     * Enum SWR_REPO for value: "swr:repo"
     */
    public static final ResourceType SWR_REPO = new ResourceType("swr:repo");

    /**
     * Enum CBR_BACKUP for value: "cbr:backup"
     */
    public static final ResourceType CBR_BACKUP = new ResourceType("cbr:backup");

    /**
     * Enum IMS_IMAGE for value: "ims:image"
     */
    public static final ResourceType IMS_IMAGE = new ResourceType("ims:image");

    private static final Map<String, ResourceType> STATIC_FIELDS = createStaticFields();

    private static Map<String, ResourceType> createStaticFields() {
        Map<String, ResourceType> map = new HashMap<>();
        map.put("iam:agency", IAM_AGENCY);
        map.put("iam:user", IAM_USER);
        map.put("kms:cmk", KMS_CMK);
        map.put("obs:bucket", OBS_BUCKET);
        map.put("swr:repo", SWR_REPO);
        map.put("cbr:backup", CBR_BACKUP);
        map.put("ims:image", IMS_IMAGE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ResourceType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ResourceType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceType(value));
    }

    public static ResourceType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ResourceType) {
            return this.value.equals(((ResourceType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
