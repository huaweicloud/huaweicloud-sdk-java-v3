package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateComponentConfigurationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "envs")

    private List<ComponentConfigEnvs> envs = null;

    public CreateComponentConfigurationResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get version
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public CreateComponentConfigurationResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public CreateComponentConfigurationResponse withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * Get creator
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public CreateComponentConfigurationResponse withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 来源版本号
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public CreateComponentConfigurationResponse withEnvs(List<ComponentConfigEnvs> envs) {
        this.envs = envs;
        return this;
    }

    public CreateComponentConfigurationResponse addEnvsItem(ComponentConfigEnvs envsItem) {
        if (this.envs == null) {
            this.envs = new ArrayList<>();
        }
        this.envs.add(envsItem);
        return this;
    }

    public CreateComponentConfigurationResponse withEnvs(Consumer<List<ComponentConfigEnvs>> envsSetter) {
        if (this.envs == null) {
            this.envs = new ArrayList<>();
        }
        envsSetter.accept(this.envs);
        return this;
    }

    /**
     * application environment parameters
     * @return envs
     */
    public List<ComponentConfigEnvs> getEnvs() {
        return envs;
    }

    public void setEnvs(List<ComponentConfigEnvs> envs) {
        this.envs = envs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateComponentConfigurationResponse createComponentConfigurationResponse =
            (CreateComponentConfigurationResponse) o;
        return Objects.equals(this.version, createComponentConfigurationResponse.version)
            && Objects.equals(this.createTime, createComponentConfigurationResponse.createTime)
            && Objects.equals(this.creator, createComponentConfigurationResponse.creator)
            && Objects.equals(this.source, createComponentConfigurationResponse.source)
            && Objects.equals(this.envs, createComponentConfigurationResponse.envs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, createTime, creator, source, envs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateComponentConfigurationResponse {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    envs: ").append(toIndentedString(envs)).append("\n");
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
