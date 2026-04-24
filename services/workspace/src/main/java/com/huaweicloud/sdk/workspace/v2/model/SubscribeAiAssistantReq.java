package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * AI助手订阅用户请求，支持添加或删除用户、用户组、项目的订阅。
 */
public class SubscribeAiAssistantReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add")

    private SubscribeOperationReq add;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete")

    private SubscribeOperationReq delete;

    public SubscribeAiAssistantReq withAdd(SubscribeOperationReq add) {
        this.add = add;
        return this;
    }

    public SubscribeAiAssistantReq withAdd(Consumer<SubscribeOperationReq> addSetter) {
        if (this.add == null) {
            this.add = new SubscribeOperationReq();
            addSetter.accept(this.add);
        }

        return this;
    }

    /**
     * Get add
     * @return add
     */
    public SubscribeOperationReq getAdd() {
        return add;
    }

    public void setAdd(SubscribeOperationReq add) {
        this.add = add;
    }

    public SubscribeAiAssistantReq withDelete(SubscribeOperationReq delete) {
        this.delete = delete;
        return this;
    }

    public SubscribeAiAssistantReq withDelete(Consumer<SubscribeOperationReq> deleteSetter) {
        if (this.delete == null) {
            this.delete = new SubscribeOperationReq();
            deleteSetter.accept(this.delete);
        }

        return this;
    }

    /**
     * Get delete
     * @return delete
     */
    public SubscribeOperationReq getDelete() {
        return delete;
    }

    public void setDelete(SubscribeOperationReq delete) {
        this.delete = delete;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscribeAiAssistantReq that = (SubscribeAiAssistantReq) obj;
        return Objects.equals(this.add, that.add) && Objects.equals(this.delete, that.delete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(add, delete);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscribeAiAssistantReq {\n");
        sb.append("    add: ").append(toIndentedString(add)).append("\n");
        sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
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
