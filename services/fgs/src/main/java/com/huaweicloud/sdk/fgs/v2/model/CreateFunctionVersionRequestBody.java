package com.huaweicloud.sdk.fgs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * CreateFunctionVersionRequestBody
 */
public class CreateFunctionVersionRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="digest")
    
    private String digest;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;

    public CreateFunctionVersionRequestBody withDigest(String digest) {
        this.digest = digest;
        return this;
    }

    


    /**
     * md5键值
     * @return digest
     */
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public CreateFunctionVersionRequestBody withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 发布版本名称
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public CreateFunctionVersionRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 发布版本描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateFunctionVersionRequestBody createFunctionVersionRequestBody = (CreateFunctionVersionRequestBody) o;
        return Objects.equals(this.digest, createFunctionVersionRequestBody.digest) &&
            Objects.equals(this.version, createFunctionVersionRequestBody.version) &&
            Objects.equals(this.description, createFunctionVersionRequestBody.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(digest, version, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFunctionVersionRequestBody {\n");
            sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
            sb.append("    version: ").append(toIndentedString(version)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

