package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateRunRequestBody
 */
public class CreateRunRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computing_resource_id")

    @JacksonXmlProperty(localName = "computing_resource_id")

    private String computingResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conf")

    @JacksonXmlProperty(localName = "conf")

    private List<String> conf = null;

    public CreateRunRequestBody withComputingResourceId(String computingResourceId) {
        this.computingResourceId = computingResourceId;
        return this;
    }

    /**
     * 计算资源ID。
     * @return computingResourceId
     */
    public String getComputingResourceId() {
        return computingResourceId;
    }

    public void setComputingResourceId(String computingResourceId) {
        this.computingResourceId = computingResourceId;
    }

    public CreateRunRequestBody withConf(List<String> conf) {
        this.conf = conf;
        return this;
    }

    public CreateRunRequestBody addConfItem(String confItem) {
        if (this.conf == null) {
            this.conf = new ArrayList<>();
        }
        this.conf.add(confItem);
        return this;
    }

    public CreateRunRequestBody withConf(Consumer<List<String>> confSetter) {
        if (this.conf == null) {
            this.conf = new ArrayList<>();
        }
        confSetter.accept(this.conf);
        return this;
    }

    /**
     * 作业配置项。
     * @return conf
     */
    public List<String> getConf() {
        return conf;
    }

    public void setConf(List<String> conf) {
        this.conf = conf;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRunRequestBody createRunRequestBody = (CreateRunRequestBody) o;
        return Objects.equals(this.computingResourceId, createRunRequestBody.computingResourceId)
            && Objects.equals(this.conf, createRunRequestBody.conf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(computingResourceId, conf);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRunRequestBody {\n");
        sb.append("    computingResourceId: ").append(toIndentedString(computingResourceId)).append("\n");
        sb.append("    conf: ").append(toIndentedString(conf)).append("\n");
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
