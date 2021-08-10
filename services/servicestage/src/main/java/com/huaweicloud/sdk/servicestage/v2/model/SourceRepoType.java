package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/** 代码仓类型，支持GitHub、GitLab、Gitee、Bitbucket。 */
public class SourceRepoType {

    /** Enum GITHUB for value: "GitHub" */
    public static final SourceRepoType GITHUB = new SourceRepoType("GitHub");

    /** Enum GITLAB for value: "GitLab" */
    public static final SourceRepoType GITLAB = new SourceRepoType("GitLab");

    /** Enum GITEE for value: "Gitee" */
    public static final SourceRepoType GITEE = new SourceRepoType("Gitee");

    /** Enum BITBUCKET for value: "Bitbucket" */
    public static final SourceRepoType BITBUCKET = new SourceRepoType("Bitbucket");

    private static final Map<String, SourceRepoType> STATIC_FIELDS = createStaticFields();

    private static Map<String, SourceRepoType> createStaticFields() {
        Map<String, SourceRepoType> map = new HashMap<>();
        map.put("GitHub", GITHUB);
        map.put("GitLab", GITLAB);
        map.put("Gitee", GITEE);
        map.put("Bitbucket", BITBUCKET);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    SourceRepoType(String value) {
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
    public static SourceRepoType fromValue(String value) {
        if (value == null) {
            return null;
        }
        SourceRepoType result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new SourceRepoType(value);
        }
        return result;
    }

    public static SourceRepoType valueOf(String value) {
        if (value == null) {
            return null;
        }
        SourceRepoType result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SourceRepoType) {
            return this.value.equals(((SourceRepoType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
