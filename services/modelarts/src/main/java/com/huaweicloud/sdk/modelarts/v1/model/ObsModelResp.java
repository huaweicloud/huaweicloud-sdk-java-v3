package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：自定义训练作业产物obs输出信息。
 */
public class ObsModelResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_path")

    private String obsPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_path")

    private String localPath;

    public ObsModelResp withObsPath(String obsPath) {
        this.obsPath = obsPath;
        return this;
    }

    /**
     * **参数解释**：自定义训练作业产物保存的OBS地址，如：“obs://example/path”。 **取值范围**：不涉及。
     * @return obsPath
     */
    public String getObsPath() {
        return obsPath;
    }

    public void setObsPath(String obsPath) {
        this.obsPath = obsPath;
    }

    public ObsModelResp withLocalPath(String localPath) {
        this.localPath = localPath;
        return this;
    }

    /**
     * **参数解释**：自定义训练作业产物保存的宿主机的路径，如：“/example/path”。 **取值范围**：不涉及。
     * @return localPath
     */
    public String getLocalPath() {
        return localPath;
    }

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObsModelResp that = (ObsModelResp) obj;
        return Objects.equals(this.obsPath, that.obsPath) && Objects.equals(this.localPath, that.localPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obsPath, localPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObsModelResp {\n");
        sb.append("    obsPath: ").append(toIndentedString(obsPath)).append("\n");
        sb.append("    localPath: ").append(toIndentedString(localPath)).append("\n");
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
