package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ApiMoveParaDTO
 */
public class ApiMoveParaDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_pid")

    private String targetPid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apis")

    private List<String> apis = null;

    public ApiMoveParaDTO withTargetPid(String targetPid) {
        this.targetPid = targetPid;
        return this;
    }

    /**
     * 父目录编号
     * @return targetPid
     */
    public String getTargetPid() {
        return targetPid;
    }

    public void setTargetPid(String targetPid) {
        this.targetPid = targetPid;
    }

    public ApiMoveParaDTO withApis(List<String> apis) {
        this.apis = apis;
        return this;
    }

    public ApiMoveParaDTO addApisItem(String apisItem) {
        if (this.apis == null) {
            this.apis = new ArrayList<>();
        }
        this.apis.add(apisItem);
        return this;
    }

    public ApiMoveParaDTO withApis(Consumer<List<String>> apisSetter) {
        if (this.apis == null) {
            this.apis = new ArrayList<>();
        }
        apisSetter.accept(this.apis);
        return this;
    }

    /**
     * 需要移动的目录
     * @return apis
     */
    public List<String> getApis() {
        return apis;
    }

    public void setApis(List<String> apis) {
        this.apis = apis;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApiMoveParaDTO that = (ApiMoveParaDTO) obj;
        return Objects.equals(this.targetPid, that.targetPid) && Objects.equals(this.apis, that.apis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetPid, apis);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiMoveParaDTO {\n");
        sb.append("    targetPid: ").append(toIndentedString(targetPid)).append("\n");
        sb.append("    apis: ").append(toIndentedString(apis)).append("\n");
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
