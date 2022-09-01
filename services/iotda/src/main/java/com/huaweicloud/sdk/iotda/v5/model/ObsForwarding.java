package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 服务配置信息
 */
public class ObsForwarding {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    @JacksonXmlProperty(localName = "region_name")

    private String regionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    @JacksonXmlProperty(localName = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    @JacksonXmlProperty(localName = "location")

    private String location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    @JacksonXmlProperty(localName = "file_path")

    private String filePath;

    public ObsForwarding withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * **参数说明**：OBS服务对应的region区域
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public ObsForwarding withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数说明**：OBS服务对应的projectId信息
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ObsForwarding withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * **参数说明**：OBS服务对应的桶名称
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public ObsForwarding withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * **参数说明**：OBS服务对应桶的区域
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ObsForwarding withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * **参数说明**：OBS服务中存储通道文件的自定义目录,多级目录可用(/)进行分隔，不可以斜杠(/)开头或结尾，不能包含两个以上相邻的斜杠(/) **取值范围**: 英文字母(a-zA-Z)、数字(0-9)、下划线(_)、中划线(-)、斜杠(/)和大括号({})，最大字符长度256个字符。其中大括号只能用于对应模板参数。 **模板参数**:    - \\{YYYY\\} 年   - \\{MM\\} 月   - \\{DD\\} 日   - \\{HH\\} 小时   - \\{appId\\} 应用ID   - \\{deviceId\\} 设备ID   例如:自定义目录结构为\\{YYYY\\}/\\{MM\\}/\\{DD\\}/\\{HH\\},则会在转发数据时，根据当前时间往对应的目录结构2021>08>11>09下生成对应的数据。 
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ObsForwarding obsForwarding = (ObsForwarding) o;
        return Objects.equals(this.regionName, obsForwarding.regionName)
            && Objects.equals(this.projectId, obsForwarding.projectId)
            && Objects.equals(this.bucketName, obsForwarding.bucketName)
            && Objects.equals(this.location, obsForwarding.location)
            && Objects.equals(this.filePath, obsForwarding.filePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionName, projectId, bucketName, location, filePath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObsForwarding {\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
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
