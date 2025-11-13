package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchUpdatePublicRecordsetsTaskRequestBody
 */
public class BatchUpdatePublicRecordsetsTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_names")

    private List<String> zoneNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private BatchUpdatePublicRecordsetsFilter filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_info")

    private BatchUpdatePublicRecordsetsUpdateValue updateInfo;

    public BatchUpdatePublicRecordsetsTaskRequestBody withZoneNames(List<String> zoneNames) {
        this.zoneNames = zoneNames;
        return this;
    }

    public BatchUpdatePublicRecordsetsTaskRequestBody addZoneNamesItem(String zoneNamesItem) {
        if (this.zoneNames == null) {
            this.zoneNames = new ArrayList<>();
        }
        this.zoneNames.add(zoneNamesItem);
        return this;
    }

    public BatchUpdatePublicRecordsetsTaskRequestBody withZoneNames(Consumer<List<String>> zoneNamesSetter) {
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

    public BatchUpdatePublicRecordsetsTaskRequestBody withFilter(BatchUpdatePublicRecordsetsFilter filter) {
        this.filter = filter;
        return this;
    }

    public BatchUpdatePublicRecordsetsTaskRequestBody withFilter(
        Consumer<BatchUpdatePublicRecordsetsFilter> filterSetter) {
        if (this.filter == null) {
            this.filter = new BatchUpdatePublicRecordsetsFilter();
            filterSetter.accept(this.filter);
        }

        return this;
    }

    /**
     * Get filter
     * @return filter
     */
    public BatchUpdatePublicRecordsetsFilter getFilter() {
        return filter;
    }

    public void setFilter(BatchUpdatePublicRecordsetsFilter filter) {
        this.filter = filter;
    }

    public BatchUpdatePublicRecordsetsTaskRequestBody withUpdateInfo(
        BatchUpdatePublicRecordsetsUpdateValue updateInfo) {
        this.updateInfo = updateInfo;
        return this;
    }

    public BatchUpdatePublicRecordsetsTaskRequestBody withUpdateInfo(
        Consumer<BatchUpdatePublicRecordsetsUpdateValue> updateInfoSetter) {
        if (this.updateInfo == null) {
            this.updateInfo = new BatchUpdatePublicRecordsetsUpdateValue();
            updateInfoSetter.accept(this.updateInfo);
        }

        return this;
    }

    /**
     * Get updateInfo
     * @return updateInfo
     */
    public BatchUpdatePublicRecordsetsUpdateValue getUpdateInfo() {
        return updateInfo;
    }

    public void setUpdateInfo(BatchUpdatePublicRecordsetsUpdateValue updateInfo) {
        this.updateInfo = updateInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdatePublicRecordsetsTaskRequestBody that = (BatchUpdatePublicRecordsetsTaskRequestBody) obj;
        return Objects.equals(this.zoneNames, that.zoneNames) && Objects.equals(this.filter, that.filter)
            && Objects.equals(this.updateInfo, that.updateInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneNames, filter, updateInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdatePublicRecordsetsTaskRequestBody {\n");
        sb.append("    zoneNames: ").append(toIndentedString(zoneNames)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    updateInfo: ").append(toIndentedString(updateInfo)).append("\n");
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
