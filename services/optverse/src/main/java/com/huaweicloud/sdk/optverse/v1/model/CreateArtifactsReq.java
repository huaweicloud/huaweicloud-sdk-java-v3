package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateArtifactsReq
 */
public class CreateArtifactsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filenames")

    private List<String> filenames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage_name")

    private StageName stageName;

    public CreateArtifactsReq withFilenames(List<String> filenames) {
        this.filenames = filenames;
        return this;
    }

    public CreateArtifactsReq addFilenamesItem(String filenamesItem) {
        if (this.filenames == null) {
            this.filenames = new ArrayList<>();
        }
        this.filenames.add(filenamesItem);
        return this;
    }

    public CreateArtifactsReq withFilenames(Consumer<List<String>> filenamesSetter) {
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

    public CreateArtifactsReq withStageName(StageName stageName) {
        this.stageName = stageName;
        return this;
    }

    /**
     * Get stageName
     * @return stageName
     */
    public StageName getStageName() {
        return stageName;
    }

    public void setStageName(StageName stageName) {
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
        CreateArtifactsReq that = (CreateArtifactsReq) obj;
        return Objects.equals(this.filenames, that.filenames) && Objects.equals(this.stageName, that.stageName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filenames, stageName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateArtifactsReq {\n");
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
