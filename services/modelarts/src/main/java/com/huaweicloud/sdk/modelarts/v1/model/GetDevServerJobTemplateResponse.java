package com.huaweicloud.sdk.modelarts.v1.model;

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
public class GetDevServerJobTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmd")

    private String cmd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swr_path")

    private String swrPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private String resources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes")

    private String volumes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes_mount")

    private String volumesMount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_type")

    private String flavorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private String timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_interval")

    private String checkInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private List<TemplateParam> params = null;

    public GetDevServerJobTemplateResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：模板id。 **取值范围**：不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GetDevServerJobTemplateResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：模板名称。 **取值范围**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GetDevServerJobTemplateResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：模板描述。 **取值范围**：不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GetDevServerJobTemplateResponse withCmd(String cmd) {
        this.cmd = cmd;
        return this;
    }

    /**
     * **参数解释**：容器启动命令。 **取值范围**：不涉及。
     * @return cmd
     */
    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public GetDevServerJobTemplateResponse withSwrPath(String swrPath) {
        this.swrPath = swrPath;
        return this;
    }

    /**
     * **参数解释**：任务镜像。 **取值范围**：不涉及。
     * @return swrPath
     */
    public String getSwrPath() {
        return swrPath;
    }

    public void setSwrPath(String swrPath) {
        this.swrPath = swrPath;
    }

    public GetDevServerJobTemplateResponse withResources(String resources) {
        this.resources = resources;
        return this;
    }

    /**
     * **参数解释**：任务规格。 **取值范围**：不涉及。
     * @return resources
     */
    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }

    public GetDevServerJobTemplateResponse withVolumes(String volumes) {
        this.volumes = volumes;
        return this;
    }

    /**
     * **参数解释**：卷。 **取值范围**：不涉及。
     * @return volumes
     */
    public String getVolumes() {
        return volumes;
    }

    public void setVolumes(String volumes) {
        this.volumes = volumes;
    }

    public GetDevServerJobTemplateResponse withVolumesMount(String volumesMount) {
        this.volumesMount = volumesMount;
        return this;
    }

    /**
     * **参数解释**：卷挂载。 **取值范围**：不涉及。
     * @return volumesMount
     */
    public String getVolumesMount() {
        return volumesMount;
    }

    public void setVolumesMount(String volumesMount) {
        this.volumesMount = volumesMount;
    }

    public GetDevServerJobTemplateResponse withFlavorType(String flavorType) {
        this.flavorType = flavorType;
        return this;
    }

    /**
     * **参数解释**：规格类型。 **取值范围**：-ASCEND_SNT9B   -ASCEND_SNT9C   -ASCEND_GENERIC。
     * @return flavorType
     */
    public String getFlavorType() {
        return flavorType;
    }

    public void setFlavorType(String flavorType) {
        this.flavorType = flavorType;
    }

    public GetDevServerJobTemplateResponse withTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * **参数解释**：任务超时时间。 **取值范围**：不涉及。
     * @return timeout
     */
    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public GetDevServerJobTemplateResponse withCheckInterval(String checkInterval) {
        this.checkInterval = checkInterval;
        return this;
    }

    /**
     * **参数解释**：任务的轮询周期。 **取值范围**：不涉及。
     * @return checkInterval
     */
    public String getCheckInterval() {
        return checkInterval;
    }

    public void setCheckInterval(String checkInterval) {
        this.checkInterval = checkInterval;
    }

    public GetDevServerJobTemplateResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：任务类型。 **取值范围**：-LOG_COLLECT  -COMMON 等
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GetDevServerJobTemplateResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：模板状态。 **取值范围**：ACTIVE。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public GetDevServerJobTemplateResponse withParams(List<TemplateParam> params) {
        this.params = params;
        return this;
    }

    public GetDevServerJobTemplateResponse addParamsItem(TemplateParam paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public GetDevServerJobTemplateResponse withParams(Consumer<List<TemplateParam>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * **参数解释**：模板的其他参数。
     * @return params
     */
    public List<TemplateParam> getParams() {
        return params;
    }

    public void setParams(List<TemplateParam> params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetDevServerJobTemplateResponse that = (GetDevServerJobTemplateResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.cmd, that.cmd)
            && Objects.equals(this.swrPath, that.swrPath) && Objects.equals(this.resources, that.resources)
            && Objects.equals(this.volumes, that.volumes) && Objects.equals(this.volumesMount, that.volumesMount)
            && Objects.equals(this.flavorType, that.flavorType) && Objects.equals(this.timeout, that.timeout)
            && Objects.equals(this.checkInterval, that.checkInterval) && Objects.equals(this.type, that.type)
            && Objects.equals(this.status, that.status) && Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            cmd,
            swrPath,
            resources,
            volumes,
            volumesMount,
            flavorType,
            timeout,
            checkInterval,
            type,
            status,
            params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetDevServerJobTemplateResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    cmd: ").append(toIndentedString(cmd)).append("\n");
        sb.append("    swrPath: ").append(toIndentedString(swrPath)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
        sb.append("    volumesMount: ").append(toIndentedString(volumesMount)).append("\n");
        sb.append("    flavorType: ").append(toIndentedString(flavorType)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    checkInterval: ").append(toIndentedString(checkInterval)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
