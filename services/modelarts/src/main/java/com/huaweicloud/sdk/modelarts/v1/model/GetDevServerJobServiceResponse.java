package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class GetDevServerJobServiceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private Map<String, String> spec = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<AIServiceInstance> instances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private Model model;

    public GetDevServerJobServiceResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：部署服务的id。 **取值范围**：不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GetDevServerJobServiceResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：部署服务名称。 **取值范围**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GetDevServerJobServiceResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：部署实例状态。 **取值范围**：- CREATING  - RUNNING  - FAILED  -DELETED  - ERROR。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public GetDevServerJobServiceResponse withSpec(Map<String, String> spec) {
        this.spec = spec;
        return this;
    }

    public GetDevServerJobServiceResponse putSpecItem(String key, String specItem) {
        if (this.spec == null) {
            this.spec = new HashMap<>();
        }
        this.spec.put(key, specItem);
        return this;
    }

    public GetDevServerJobServiceResponse withSpec(Consumer<Map<String, String>> specSetter) {
        if (this.spec == null) {
            this.spec = new HashMap<>();
        }
        specSetter.accept(this.spec);
        return this;
    }

    /**
     * **参数解释**：部署服务特性参数。 **取值范围**：不涉及。
     * @return spec
     */
    public Map<String, String> getSpec() {
        return spec;
    }

    public void setSpec(Map<String, String> spec) {
        this.spec = spec;
    }

    public GetDevServerJobServiceResponse withInstances(List<AIServiceInstance> instances) {
        this.instances = instances;
        return this;
    }

    public GetDevServerJobServiceResponse addInstancesItem(AIServiceInstance instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public GetDevServerJobServiceResponse withInstances(Consumer<List<AIServiceInstance>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * **参数解释**：部署服务实例。
     * @return instances
     */
    public List<AIServiceInstance> getInstances() {
        return instances;
    }

    public void setInstances(List<AIServiceInstance> instances) {
        this.instances = instances;
    }

    public GetDevServerJobServiceResponse withModel(Model model) {
        this.model = model;
        return this;
    }

    public GetDevServerJobServiceResponse withModel(Consumer<Model> modelSetter) {
        if (this.model == null) {
            this.model = new Model();
            modelSetter.accept(this.model);
        }

        return this;
    }

    /**
     * Get model
     * @return model
     */
    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetDevServerJobServiceResponse that = (GetDevServerJobServiceResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.spec, that.spec)
            && Objects.equals(this.instances, that.instances) && Objects.equals(this.model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, spec, instances, model);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetDevServerJobServiceResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
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
