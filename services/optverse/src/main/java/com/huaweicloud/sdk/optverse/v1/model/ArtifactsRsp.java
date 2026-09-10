package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ArtifactsRsp
 */
public class ArtifactsRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filenames")

    private List<String> filenames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage_name")

    private String stageName;

    public ArtifactsRsp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**： 创建时间。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ArtifactsRsp withFilenames(List<String> filenames) {
        this.filenames = filenames;
        return this;
    }

    public ArtifactsRsp addFilenamesItem(String filenamesItem) {
        if (this.filenames == null) {
            this.filenames = new ArrayList<>();
        }
        this.filenames.add(filenamesItem);
        return this;
    }

    public ArtifactsRsp withFilenames(Consumer<List<String>> filenamesSetter) {
        if (this.filenames == null) {
            this.filenames = new ArrayList<>();
        }
        filenamesSetter.accept(this.filenames);
        return this;
    }

    /**
     * **参数解释**： 标签列表。 **约束限制**： 产物列表不能超过10条。 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return filenames
     */
    public List<String> getFilenames() {
        return filenames;
    }

    public void setFilenames(List<String> filenames) {
        this.filenames = filenames;
    }

    public ArtifactsRsp withStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }

    /**
     * **参数解释**： 绑定状态。 **约束限制**： 不涉及 **取值范围**： * requirement_analyzer：构建需求文档。 * modeling：构建数学模型。 * data：校验模型数据。 * solver：求解数学模型。 * report：业务辅助分析。 * business_planner：构建需求文档 * data_agent：原始数据处理 * vrp：路径规划求解 **默认取值**： 不涉及 
     * @return stageName
     */
    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ArtifactsRsp that = (ArtifactsRsp) obj;
        return Objects.equals(this.createTime, that.createTime) && Objects.equals(this.filenames, that.filenames)
            && Objects.equals(this.stageName, that.stageName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime, filenames, stageName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArtifactsRsp {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    filenames: ").append(toIndentedString(filenames)).append("\n");
        sb.append("    stageName: ").append(toIndentedString(stageName)).append("\n");
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
