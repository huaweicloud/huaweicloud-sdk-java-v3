package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeletePublicRecordsetsTaskRequestBody
 */
public class BatchDeletePublicRecordsetsTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_names")

    private List<String> zoneNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordset_name_prefixes")

    private List<String> recordsetNamePrefixes = null;

    public BatchDeletePublicRecordsetsTaskRequestBody withZoneNames(List<String> zoneNames) {
        this.zoneNames = zoneNames;
        return this;
    }

    public BatchDeletePublicRecordsetsTaskRequestBody addZoneNamesItem(String zoneNamesItem) {
        if (this.zoneNames == null) {
            this.zoneNames = new ArrayList<>();
        }
        this.zoneNames.add(zoneNamesItem);
        return this;
    }

    public BatchDeletePublicRecordsetsTaskRequestBody withZoneNames(Consumer<List<String>> zoneNamesSetter) {
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

    public BatchDeletePublicRecordsetsTaskRequestBody withRecordsetNamePrefixes(List<String> recordsetNamePrefixes) {
        this.recordsetNamePrefixes = recordsetNamePrefixes;
        return this;
    }

    public BatchDeletePublicRecordsetsTaskRequestBody addRecordsetNamePrefixesItem(String recordsetNamePrefixesItem) {
        if (this.recordsetNamePrefixes == null) {
            this.recordsetNamePrefixes = new ArrayList<>();
        }
        this.recordsetNamePrefixes.add(recordsetNamePrefixesItem);
        return this;
    }

    public BatchDeletePublicRecordsetsTaskRequestBody withRecordsetNamePrefixes(
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeletePublicRecordsetsTaskRequestBody that = (BatchDeletePublicRecordsetsTaskRequestBody) obj;
        return Objects.equals(this.zoneNames, that.zoneNames)
            && Objects.equals(this.recordsetNamePrefixes, that.recordsetNamePrefixes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneNames, recordsetNamePrefixes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeletePublicRecordsetsTaskRequestBody {\n");
        sb.append("    zoneNames: ").append(toIndentedString(zoneNames)).append("\n");
        sb.append("    recordsetNamePrefixes: ").append(toIndentedString(recordsetNamePrefixes)).append("\n");
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
