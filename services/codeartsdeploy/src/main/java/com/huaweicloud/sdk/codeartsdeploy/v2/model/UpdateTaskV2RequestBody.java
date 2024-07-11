package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateTaskV2RequestBody
 */
public class UpdateTaskV2RequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * 部署系统，deployTemplate：部署模板
     */
    public static final class DeploySystemEnum {

        /**
         * Enum DEPLOYTEMPLATE for value: "deployTemplate"
         */
        public static final DeploySystemEnum DEPLOYTEMPLATE = new DeploySystemEnum("deployTemplate");

        private static final Map<String, DeploySystemEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeploySystemEnum> createStaticFields() {
            Map<String, DeploySystemEnum> map = new HashMap<>();
            map.put("deployTemplate", DEPLOYTEMPLATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeploySystemEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DeploySystemEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DeploySystemEnum(value));
        }

        public static DeploySystemEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeploySystemEnum) {
                return this.value.equals(((DeploySystemEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_system")

    private DeploySystemEnum deploySystem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_list")

    private List<DeployV2OperationsDO> operationList = null;

    public UpdateTaskV2RequestBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 部署任务id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateTaskV2RequestBody withDeploySystem(DeploySystemEnum deploySystem) {
        this.deploySystem = deploySystem;
        return this;
    }

    /**
     * 部署系统，deployTemplate：部署模板
     * @return deploySystem
     */
    public DeploySystemEnum getDeploySystem() {
        return deploySystem;
    }

    public void setDeploySystem(DeploySystemEnum deploySystem) {
        this.deploySystem = deploySystem;
    }

    public UpdateTaskV2RequestBody withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 部署模板实例id
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public UpdateTaskV2RequestBody withOperationList(List<DeployV2OperationsDO> operationList) {
        this.operationList = operationList;
        return this;
    }

    public UpdateTaskV2RequestBody addOperationListItem(DeployV2OperationsDO operationListItem) {
        if (this.operationList == null) {
            this.operationList = new ArrayList<>();
        }
        this.operationList.add(operationListItem);
        return this;
    }

    public UpdateTaskV2RequestBody withOperationList(Consumer<List<DeployV2OperationsDO>> operationListSetter) {
        if (this.operationList == null) {
            this.operationList = new ArrayList<>();
        }
        operationListSetter.accept(this.operationList);
        return this;
    }

    /**
     * 部署编排列表信息
     * @return operationList
     */
    public List<DeployV2OperationsDO> getOperationList() {
        return operationList;
    }

    public void setOperationList(List<DeployV2OperationsDO> operationList) {
        this.operationList = operationList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTaskV2RequestBody that = (UpdateTaskV2RequestBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.deploySystem, that.deploySystem)
            && Objects.equals(this.templateId, that.templateId)
            && Objects.equals(this.operationList, that.operationList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, deploySystem, templateId, operationList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTaskV2RequestBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    deploySystem: ").append(toIndentedString(deploySystem)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    operationList: ").append(toIndentedString(operationList)).append("\n");
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
