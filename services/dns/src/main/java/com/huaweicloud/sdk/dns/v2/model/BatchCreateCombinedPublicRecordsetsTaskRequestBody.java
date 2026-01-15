package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchCreateCombinedPublicRecordsetsTaskRequestBody
 */
public class BatchCreateCombinedPublicRecordsetsTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_names")

    private List<String> zoneNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordset_name_prefixes")

    private List<String> recordsetNamePrefixes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<String> records = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line")

    private String line;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private Integer ttl;

    public BatchCreateCombinedPublicRecordsetsTaskRequestBody withZoneNames(List<String> zoneNames) {
        this.zoneNames = zoneNames;
        return this;
    }

    public BatchCreateCombinedPublicRecordsetsTaskRequestBody addZoneNamesItem(String zoneNamesItem) {
        if (this.zoneNames == null) {
            this.zoneNames = new ArrayList<>();
        }
        this.zoneNames.add(zoneNamesItem);
        return this;
    }

    public BatchCreateCombinedPublicRecordsetsTaskRequestBody withZoneNames(Consumer<List<String>> zoneNamesSetter) {
        if (this.zoneNames == null) {
            this.zoneNames = new ArrayList<>();
        }
        zoneNamesSetter.accept(this.zoneNames);
        return this;
    }

    /**
     * **参数解释：** 托管该记录的域名。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return zoneNames
     */
    public List<String> getZoneNames() {
        return zoneNames;
    }

    public void setZoneNames(List<String> zoneNames) {
        this.zoneNames = zoneNames;
    }

    public BatchCreateCombinedPublicRecordsetsTaskRequestBody withRecordsetNamePrefixes(
        List<String> recordsetNamePrefixes) {
        this.recordsetNamePrefixes = recordsetNamePrefixes;
        return this;
    }

    public BatchCreateCombinedPublicRecordsetsTaskRequestBody addRecordsetNamePrefixesItem(
        String recordsetNamePrefixesItem) {
        if (this.recordsetNamePrefixes == null) {
            this.recordsetNamePrefixes = new ArrayList<>();
        }
        this.recordsetNamePrefixes.add(recordsetNamePrefixesItem);
        return this;
    }

    public BatchCreateCombinedPublicRecordsetsTaskRequestBody withRecordsetNamePrefixes(
        Consumer<List<String>> recordsetNamePrefixesSetter) {
        if (this.recordsetNamePrefixes == null) {
            this.recordsetNamePrefixes = new ArrayList<>();
        }
        recordsetNamePrefixesSetter.accept(this.recordsetNamePrefixes);
        return this;
    }

    /**
     * **参数解释：** 主机记录。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return recordsetNamePrefixes
     */
    public List<String> getRecordsetNamePrefixes() {
        return recordsetNamePrefixes;
    }

    public void setRecordsetNamePrefixes(List<String> recordsetNamePrefixes) {
        this.recordsetNamePrefixes = recordsetNamePrefixes;
    }

    public BatchCreateCombinedPublicRecordsetsTaskRequestBody withRecords(List<String> records) {
        this.records = records;
        return this;
    }

    public BatchCreateCombinedPublicRecordsetsTaskRequestBody addRecordsItem(String recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public BatchCreateCombinedPublicRecordsetsTaskRequestBody withRecords(Consumer<List<String>> recordsSetter) {
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

    public BatchCreateCombinedPublicRecordsetsTaskRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 记录集的类型。 **约束限制：** 不涉及。 **取值范围：** - A：将域名解析到指定的IPv4地址。 - AAAA：将域名解析到指定的IPv6地址。 - MX：指定域名对应的邮件服务器。 - CNAME：将域名解析到另一域名，或者多个域名映射到同一域名上。 - TXT：用于对域名进行标识和说明。 - SRV：用于记录某台服务器对外提供了哪些服务。 - NS：指定域名的权威DNS服务器。 - CAA：指定为域名颁发HTTPS证书的授权CA机构，仅支持公网域名解析。  **默认取值：** 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BatchCreateCombinedPublicRecordsetsTaskRequestBody withLine(String line) {
        this.line = line;
        return this;
    }

    /**
     * **参数解释：** 解析线路ID。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** default_view。
     * @return line
     */
    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public BatchCreateCombinedPublicRecordsetsTaskRequestBody withTtl(Integer ttl) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateCombinedPublicRecordsetsTaskRequestBody that =
            (BatchCreateCombinedPublicRecordsetsTaskRequestBody) obj;
        return Objects.equals(this.zoneNames, that.zoneNames)
            && Objects.equals(this.recordsetNamePrefixes, that.recordsetNamePrefixes)
            && Objects.equals(this.records, that.records) && Objects.equals(this.type, that.type)
            && Objects.equals(this.line, that.line) && Objects.equals(this.ttl, that.ttl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneNames, recordsetNamePrefixes, records, type, line, ttl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateCombinedPublicRecordsetsTaskRequestBody {\n");
        sb.append("    zoneNames: ").append(toIndentedString(zoneNames)).append("\n");
        sb.append("    recordsetNamePrefixes: ").append(toIndentedString(recordsetNamePrefixes)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    line: ").append(toIndentedString(line)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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
