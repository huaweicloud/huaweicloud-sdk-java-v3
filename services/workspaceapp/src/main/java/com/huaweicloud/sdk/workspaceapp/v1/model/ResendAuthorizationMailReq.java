package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 重发授权邮件的请求结构体（根据授权邮件记录）。
 */
public class ResendAuthorizationMailReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<AuthorizationMail> records = null;

    public ResendAuthorizationMailReq withRecords(List<AuthorizationMail> records) {
        this.records = records;
        return this;
    }

    public ResendAuthorizationMailReq addRecordsItem(AuthorizationMail recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public ResendAuthorizationMailReq withRecords(Consumer<List<AuthorizationMail>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * 邮件记录。
     * @return records
     */
    public List<AuthorizationMail> getRecords() {
        return records;
    }

    public void setRecords(List<AuthorizationMail> records) {
        this.records = records;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResendAuthorizationMailReq that = (ResendAuthorizationMailReq) obj;
        return Objects.equals(this.records, that.records);
    }

    @Override
    public int hashCode() {
        return Objects.hash(records);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResendAuthorizationMailReq {\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
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
