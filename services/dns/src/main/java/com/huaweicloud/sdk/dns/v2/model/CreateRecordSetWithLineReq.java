package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateRecordSetWithLineReq
 */
public class CreateRecordSetWithLineReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    @JacksonXmlProperty(localName = "ttl")

    private Integer ttl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    @JacksonXmlProperty(localName = "records")

    private List<String> records = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line")

    @JacksonXmlProperty(localName = "line")

    private String line;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    @JacksonXmlProperty(localName = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    @JacksonXmlProperty(localName = "weight")

    private Integer weight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias_target")

    @JacksonXmlProperty(localName = "alias_target")

    private AliasTarget aliasTarget;

    public CreateRecordSetWithLineReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 域名，后缀需以zone name结束且为FQDN（即以“.”号结束的完整主机名）。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateRecordSetWithLineReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 可选配置，对域名的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateRecordSetWithLineReq withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Record Set的类型。取值范围：A、AAAA、MX、CNAME、TXT、NS、SRV、CAA。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateRecordSetWithLineReq withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 解析记录的状态。默认值为ENABLE。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateRecordSetWithLineReq withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * 解析记录在本地DNS服务器的缓存时间，缓存时间越长更新生效越慢，以秒为单位。
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public CreateRecordSetWithLineReq withRecords(List<String> records) {
        this.records = records;
        return this;
    }

    public CreateRecordSetWithLineReq addRecordsItem(String recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public CreateRecordSetWithLineReq withRecords(Consumer<List<String>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * 解析记录的值。不同类型解析记录对应的值的规则不同。
     * @return records
     */
    public List<String> getRecords() {
        return records;
    }

    public void setRecords(List<String> records) {
        this.records = records;
    }

    public CreateRecordSetWithLineReq withLine(String line) {
        this.line = line;
        return this;
    }

    /**
     * 解析线路ID
     * @return line
     */
    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public CreateRecordSetWithLineReq withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateRecordSetWithLineReq addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateRecordSetWithLineReq withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     *  资源标签
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public CreateRecordSetWithLineReq withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * 解析记录的权重。
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public CreateRecordSetWithLineReq withAliasTarget(AliasTarget aliasTarget) {
        this.aliasTarget = aliasTarget;
        return this;
    }

    public CreateRecordSetWithLineReq withAliasTarget(Consumer<AliasTarget> aliasTargetSetter) {
        if (this.aliasTarget == null) {
            this.aliasTarget = new AliasTarget();
            aliasTargetSetter.accept(this.aliasTarget);
        }

        return this;
    }

    /**
     * Get aliasTarget
     * @return aliasTarget
     */
    public AliasTarget getAliasTarget() {
        return aliasTarget;
    }

    public void setAliasTarget(AliasTarget aliasTarget) {
        this.aliasTarget = aliasTarget;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRecordSetWithLineReq createRecordSetWithLineReq = (CreateRecordSetWithLineReq) o;
        return Objects.equals(this.name, createRecordSetWithLineReq.name)
            && Objects.equals(this.description, createRecordSetWithLineReq.description)
            && Objects.equals(this.type, createRecordSetWithLineReq.type)
            && Objects.equals(this.status, createRecordSetWithLineReq.status)
            && Objects.equals(this.ttl, createRecordSetWithLineReq.ttl)
            && Objects.equals(this.records, createRecordSetWithLineReq.records)
            && Objects.equals(this.line, createRecordSetWithLineReq.line)
            && Objects.equals(this.tags, createRecordSetWithLineReq.tags)
            && Objects.equals(this.weight, createRecordSetWithLineReq.weight)
            && Objects.equals(this.aliasTarget, createRecordSetWithLineReq.aliasTarget);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, type, status, ttl, records, line, tags, weight, aliasTarget);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRecordSetWithLineReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
        sb.append("    line: ").append(toIndentedString(line)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    aliasTarget: ").append(toIndentedString(aliasTarget)).append("\n");
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
