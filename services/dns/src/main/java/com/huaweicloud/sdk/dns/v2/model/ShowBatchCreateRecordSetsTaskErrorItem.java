package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowBatchCreateRecordSetsTaskErrorItem
 */
public class ShowBatchCreateRecordSetsTaskErrorItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line")

    private String line;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private Integer ttl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<String> records = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    public ShowBatchCreateRecordSetsTaskErrorItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 域名。 **取值范围：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowBatchCreateRecordSetsTaskErrorItem withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 记录集的类型。 **取值范围：** - A：将域名解析到指定的IPv4地址。 - AAAA：将域名解析到指定的IPv6地址。 - MX：指定域名对应的邮件服务器。 - CNAME：将域名解析到另一域名，或者多个域名映射到同一域名上。 - TXT：用于对域名进行标识和说明。 - SRV：用于记录某台服务器对外提供了哪些服务。 - NS：指定域名的权威DNS服务器，当前接口仅支持公网域名解析。 - REDIRECT_URL：显性URL转发，仅支持公网域名解析。 - FORWARD_URL：隐性URL转发，仅支持公网域名解析。 - CAA：指定为域名颁发HTTPS证书的授权CA机构，仅支持公网域名解析。 - PTR：指定IP地址反向解析记录，仅支持内网域名解析。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowBatchCreateRecordSetsTaskErrorItem withLine(String line) {
        this.line = line;
        return this;
    }

    /**
     * **参数解释：** 解析线路ID。 **取值范围：** 不涉及。
     * @return line
     */
    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public ShowBatchCreateRecordSetsTaskErrorItem withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * **参数解释：** 解析记录在本地DNS服务器的缓存时间，缓存时间越长更新生效越慢，以秒为单位。 **取值范围：** 1~2147483647。
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public ShowBatchCreateRecordSetsTaskErrorItem withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * **参数解释：** 解析记录的权重。 **取值范围：** 0~1000。
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public ShowBatchCreateRecordSetsTaskErrorItem withRecords(List<String> records) {
        this.records = records;
        return this;
    }

    public ShowBatchCreateRecordSetsTaskErrorItem addRecordsItem(String recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public ShowBatchCreateRecordSetsTaskErrorItem withRecords(Consumer<List<String>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * **参数解释：** 域名解析后的值。 **取值范围：** 不涉及。
     * @return records
     */
    public List<String> getRecords() {
        return records;
    }

    public void setRecords(List<String> records) {
        this.records = records;
    }

    public ShowBatchCreateRecordSetsTaskErrorItem withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 记录集状态。 **取值范围：** - ERROR：失败
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowBatchCreateRecordSetsTaskErrorItem withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * **参数解释：** 错误码。 **取值范围：** 不涉及。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ShowBatchCreateRecordSetsTaskErrorItem withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * **参数解释：** 错误信息。 **取值范围：** 不涉及。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBatchCreateRecordSetsTaskErrorItem that = (ShowBatchCreateRecordSetsTaskErrorItem) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.line, that.line) && Objects.equals(this.ttl, that.ttl)
            && Objects.equals(this.weight, that.weight) && Objects.equals(this.records, that.records)
            && Objects.equals(this.status, that.status) && Objects.equals(this.errorCode, that.errorCode)
            && Objects.equals(this.errorMessage, that.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, line, ttl, weight, records, status, errorCode, errorMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBatchCreateRecordSetsTaskErrorItem {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    line: ").append(toIndentedString(line)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
