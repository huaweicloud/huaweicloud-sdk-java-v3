package com.huaweicloud.sdk.eihealth.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 供应商基本信息。
 */
public class AssistantModelVendorInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor_name")

    private String vendorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor_type")

    private String vendorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "models")

    private List<ModelInfo> models = null;

    public AssistantModelVendorInfo withVendorName(String vendorName) {
        this.vendorName = vendorName;
        return this;
    }

    /**
     * **参数解释**： 模型供应商名称。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return vendorName
     */
    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public AssistantModelVendorInfo withVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }

    /**
     * **参数解释**： 模型供应商类型。 **约束限制**： 不涉及 **取值范围**： * SYSTEM：预置供应商 * CUSTOM：自定义供应商 **默认取值**： 不涉及 
     * @return vendorType
     */
    public String getVendorType() {
        return vendorType;
    }

    public void setVendorType(String vendorType) {
        this.vendorType = vendorType;
    }

    public AssistantModelVendorInfo withModels(List<ModelInfo> models) {
        this.models = models;
        return this;
    }

    public AssistantModelVendorInfo addModelsItem(ModelInfo modelsItem) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        this.models.add(modelsItem);
        return this;
    }

    public AssistantModelVendorInfo withModels(Consumer<List<ModelInfo>> modelsSetter) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        modelsSetter.accept(this.models);
        return this;
    }

    /**
     * **参数解释**： 供应商模型列表。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return models
     */
    public List<ModelInfo> getModels() {
        return models;
    }

    public void setModels(List<ModelInfo> models) {
        this.models = models;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssistantModelVendorInfo that = (AssistantModelVendorInfo) obj;
        return Objects.equals(this.vendorName, that.vendorName) && Objects.equals(this.vendorType, that.vendorType)
            && Objects.equals(this.models, that.models);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendorName, vendorType, models);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssistantModelVendorInfo {\n");
        sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
        sb.append("    vendorType: ").append(toIndentedString(vendorType)).append("\n");
        sb.append("    models: ").append(toIndentedString(models)).append("\n");
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
