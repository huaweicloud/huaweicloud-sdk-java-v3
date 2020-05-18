package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.KeystoneGroupResult;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class KeystoneShowGroupResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group")
    
    private KeystoneGroupResult group = null;

    public KeystoneShowGroupResponse withGroup(KeystoneGroupResult group) {
        this.group = group;
        return this;
    }

    public KeystoneShowGroupResponse withGroup(Consumer<KeystoneGroupResult> groupSetter) {
        if(this.group == null ){
            this.group = new KeystoneGroupResult();
        }
        groupSetter.accept(this.group);
        return this;
    }


    /**
     * Get group
     * @return group
     */
    public KeystoneGroupResult getGroup() {
        return group;
    }

    public void setGroup(KeystoneGroupResult group) {
        this.group = group;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneShowGroupResponse keystoneShowGroupResponse = (KeystoneShowGroupResponse) o;
        return Objects.equals(this.group, keystoneShowGroupResponse.group);
    }
    @Override
    public int hashCode() {
        return Objects.hash(group);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneShowGroupResponse {\n");
            sb.append("    group: ").append(toIndentedString(group)).append("\n");
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

