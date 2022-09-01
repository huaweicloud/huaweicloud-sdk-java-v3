package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * SimpleAccessoryV2
 */
public class SimpleAccessoryV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessory_id")

    @JacksonXmlProperty(localName = "accessory_id")

    private String accessoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_actual_name")

    @JacksonXmlProperty(localName = "file_actual_name")

    private String fileActualName;

    public SimpleAccessoryV2 withAccessoryId(String accessoryId) {
        this.accessoryId = accessoryId;
        return this;
    }

    /**
     * 附件id
     * @return accessoryId
     */
    public String getAccessoryId() {
        return accessoryId;
    }

    public void setAccessoryId(String accessoryId) {
        this.accessoryId = accessoryId;
    }

    public SimpleAccessoryV2 withFileActualName(String fileActualName) {
        this.fileActualName = fileActualName;
        return this;
    }

    /**
     * 附件实际名称
     * @return fileActualName
     */
    public String getFileActualName() {
        return fileActualName;
    }

    public void setFileActualName(String fileActualName) {
        this.fileActualName = fileActualName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SimpleAccessoryV2 simpleAccessoryV2 = (SimpleAccessoryV2) o;
        return Objects.equals(this.accessoryId, simpleAccessoryV2.accessoryId)
            && Objects.equals(this.fileActualName, simpleAccessoryV2.fileActualName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessoryId, fileActualName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimpleAccessoryV2 {\n");
        sb.append("    accessoryId: ").append(toIndentedString(accessoryId)).append("\n");
        sb.append("    fileActualName: ").append(toIndentedString(fileActualName)).append("\n");
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
