package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 磁盘容量信息对象。 **取值范围**： 不涉及。
 */
public class DiskInfoResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percentage")

    private String percentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_capacity")

    private String diskCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_used")

    private String diskUsed;

    public DiskInfoResponse withPercentage(String percentage) {
        this.percentage = percentage;
        return this;
    }

    /**
     * **参数解释**： 已使用百分比。 **取值范围**： 不涉及。
     * @return percentage
     */
    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public DiskInfoResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 节点ID。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DiskInfoResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 节点名。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DiskInfoResponse withDiskCapacity(String diskCapacity) {
        this.diskCapacity = diskCapacity;
        return this;
    }

    /**
     * **参数解释**： 磁盘规格。 **取值范围**： 不涉及。
     * @return diskCapacity
     */
    public String getDiskCapacity() {
        return diskCapacity;
    }

    public void setDiskCapacity(String diskCapacity) {
        this.diskCapacity = diskCapacity;
    }

    public DiskInfoResponse withDiskUsed(String diskUsed) {
        this.diskUsed = diskUsed;
        return this;
    }

    /**
     * **参数解释**： 已使用量。 **取值范围**： 不涉及。
     * @return diskUsed
     */
    public String getDiskUsed() {
        return diskUsed;
    }

    public void setDiskUsed(String diskUsed) {
        this.diskUsed = diskUsed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DiskInfoResponse that = (DiskInfoResponse) obj;
        return Objects.equals(this.percentage, that.percentage) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.diskCapacity, that.diskCapacity)
            && Objects.equals(this.diskUsed, that.diskUsed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(percentage, id, name, diskCapacity, diskUsed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiskInfoResponse {\n");
        sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    diskCapacity: ").append(toIndentedString(diskCapacity)).append("\n");
        sb.append("    diskUsed: ").append(toIndentedString(diskUsed)).append("\n");
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
