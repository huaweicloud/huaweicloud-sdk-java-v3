package com.huaweicloud.sdk.servicestage.v2.model;




import java.util.function.Consumer;
import java.util.Objects;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 代码仓类型，支持GitHub、GitLab、Gitee、Bitbucket。
 */
public class SourceRepoType {
    
    /**
     * Enum GITHUB for value: "GitHub"
     */
    public static final SourceRepoType GITHUB = new SourceRepoType("GitHub");
    
    /**
     * Enum GITLAB for value: "GitLab"
     */
    public static final SourceRepoType GITLAB = new SourceRepoType("GitLab");
    
    /**
     * Enum GITEE for value: "Gitee"
     */
    public static final SourceRepoType GITEE = new SourceRepoType("Gitee");
    
    /**
     * Enum BITBUCKET for value: "Bitbucket"
     */
    public static final SourceRepoType BITBUCKET = new SourceRepoType("Bitbucket");
    

    public static final Map<String, SourceRepoType> staticFields = new HashMap<String, SourceRepoType>() {
        { 
            put("GitHub", GITHUB);
            put("GitLab", GITLAB);
            put("Gitee", GITEE);
            put("Bitbucket", BITBUCKET);
        }
    };

    private String value;

    SourceRepoType(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static SourceRepoType fromValue(String value) {
        if( value == null ){
            return null;
        }
        SourceRepoType result = staticFields.get(value);
        if (result == null) {
            result = staticFields.putIfAbsent(value, new SourceRepoType(value));
            if (result == null) {
                result = staticFields.get(value);
            }
        }
        return result;
    }

    public static SourceRepoType valueOf(String value) {
        if( value == null ){
            return null;
        }
        SourceRepoType result = staticFields.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof SourceRepoType) {
            return this.value.equals(((SourceRepoType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}

