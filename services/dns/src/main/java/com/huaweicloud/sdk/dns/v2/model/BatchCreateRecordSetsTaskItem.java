package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchCreateRecordSetsTaskItem
 */
public class BatchCreateRecordSetsTaskItem {

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
    @JsonProperty(value = "description")

    private String description;

    public BatchCreateRecordSetsTaskItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 主机记录或域名。 末尾有点则认为是完整域名，如果不包含点，则认为是域名前缀。例如： 输入\"www\"，创建成功后域名显示为\"www.example.com.\" 输入\"www.example.com.\"（注意域名末尾有点），创建成功后域名显示为\"www.example.com.\" 输入\"www.example.com\"（注意域名末尾没有点），创建成功后域名显示为\"www.example.com.example.com.\" **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BatchCreateRecordSetsTaskItem withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 记录集的类型。 **约束限制：** 不涉及。 **取值范围：** - A：将域名解析到指定的IPv4地址。 - AAAA：将域名解析到指定的IPv6地址。 - MX：指定域名对应的邮件服务器。 - CNAME：将域名解析到另一域名，或者多个域名映射到同一域名上。 - TXT：用于对域名进行标识和说明。 - SRV：用于记录某台服务器对外提供了哪些服务。 - NS：指定域名的权威DNS服务器，当前接口仅支持公网域名解析。 - REDIRECT_URL：显性URL转发，仅支持公网域名解析。 - FORWARD_URL：隐性URL转发，仅支持公网域名解析。 - CAA：指定为域名颁发HTTPS证书的授权CA机构，仅支持公网域名解析。 - PTR：指定IP地址反向解析记录，仅支持内网域名解析。  **默认取值：** 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BatchCreateRecordSetsTaskItem withLine(String line) {
        this.line = line;
        return this;
    }

    /**
     * **参数解释：** 解析线路ID。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return line
     */
    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public BatchCreateRecordSetsTaskItem withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * **参数解释：** 解析记录在本地DNS服务器的缓存时间，缓存时间越长更新生效越慢，以秒为单位。 **约束限制：** 不涉及。 **取值范围：** 1~2147483647。 **默认取值：** 300
     * minimum: 1
     * maximum: 2147483647
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public BatchCreateRecordSetsTaskItem withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * **参数解释：** 解析记录的权重。 **约束限制：** MX记录集不支持权重，创建时会忽略权重字段，如果您的MX记录集有多个值，在一条记录集里写多个值即可。(若存在多条同主机记录、同线路类型的MX记录，会自动合并为一条创建) **取值范围：** 0~1000。 **默认取值：** 不涉及。
     * minimum: 0
     * maximum: 1000
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public BatchCreateRecordSetsTaskItem withRecords(List<String> records) {
        this.records = records;
        return this;
    }

    public BatchCreateRecordSetsTaskItem addRecordsItem(String recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public BatchCreateRecordSetsTaskItem withRecords(Consumer<List<String>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * **参数解释：** 解析记录的值。不同类型解析记录对应的值的规则不同。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return records
     */
    public List<String> getRecords() {
        return records;
    }

    public void setRecords(List<String> records) {
        this.records = records;
    }

    public BatchCreateRecordSetsTaskItem withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 解析记录的状态。 **约束限制：** 不涉及。 **取值范围：** - ENABLE：启用解析 - DISABLE：暂停解析  **默认取值：** ENABLE。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BatchCreateRecordSetsTaskItem withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 记录集的描述信息。 **约束限制：** 不涉及。 **取值范围：** 长度不超过255个字符。 **默认取值：** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateRecordSetsTaskItem that = (BatchCreateRecordSetsTaskItem) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.line, that.line) && Objects.equals(this.ttl, that.ttl)
            && Objects.equals(this.weight, that.weight) && Objects.equals(this.records, that.records)
            && Objects.equals(this.status, that.status) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, line, ttl, weight, records, status, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateRecordSetsTaskItem {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    line: ").append(toIndentedString(line)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
