package com.huaweicloud.sdk.cc.v3.model;

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
 * Request Object
 */
public class ListAuthorisationsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private List<String> name = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private List<String> description = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_connection_id")

    private List<String> cloudConnectionId = null;

    /**
    * Gets or Sets instanceId
    */
    public static final class InstanceIdEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final InstanceIdEnum ACTIVE = new InstanceIdEnum("ACTIVE");

        private static final Map<String, InstanceIdEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstanceIdEnum> createStaticFields() {
            Map<String, InstanceIdEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InstanceIdEnum(String value) {
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
        public static InstanceIdEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            InstanceIdEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new InstanceIdEnum(value);
            }
            return result;
        }

        public static InstanceIdEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            InstanceIdEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InstanceIdEnum) {
                return this.value.equals(((InstanceIdEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private List<InstanceIdEnum> instanceId = null;

    public ListAuthorisationsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页查询时，每页返回的个数。
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAuthorisationsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页查询时，上一页最后一条记录的ID，为空时为查询第一页。 使用说明：必须与limit一起使用。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListAuthorisationsRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListAuthorisationsRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListAuthorisationsRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 根据ID过滤授权列表。
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListAuthorisationsRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public ListAuthorisationsRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListAuthorisationsRequest withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * 根据名称过滤授权列表。
     * @return name
     */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public ListAuthorisationsRequest withDescription(List<String> description) {
        this.description = description;
        return this;
    }

    public ListAuthorisationsRequest addDescriptionItem(String descriptionItem) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        this.description.add(descriptionItem);
        return this;
    }

    public ListAuthorisationsRequest withDescription(Consumer<List<String>> descriptionSetter) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        descriptionSetter.accept(this.description);
        return this;
    }

    /**
     * 根据描述过滤授权列表。
     * @return description
     */
    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public ListAuthorisationsRequest withCloudConnectionId(List<String> cloudConnectionId) {
        this.cloudConnectionId = cloudConnectionId;
        return this;
    }

    public ListAuthorisationsRequest addCloudConnectionIdItem(String cloudConnectionIdItem) {
        if (this.cloudConnectionId == null) {
            this.cloudConnectionId = new ArrayList<>();
        }
        this.cloudConnectionId.add(cloudConnectionIdItem);
        return this;
    }

    public ListAuthorisationsRequest withCloudConnectionId(Consumer<List<String>> cloudConnectionIdSetter) {
        if (this.cloudConnectionId == null) {
            this.cloudConnectionId = new ArrayList<>();
        }
        cloudConnectionIdSetter.accept(this.cloudConnectionId);
        return this;
    }

    /**
     * 根据云连接实例ID过滤授权列表。
     * @return cloudConnectionId
     */
    public List<String> getCloudConnectionId() {
        return cloudConnectionId;
    }

    public void setCloudConnectionId(List<String> cloudConnectionId) {
        this.cloudConnectionId = cloudConnectionId;
    }

    public ListAuthorisationsRequest withInstanceId(List<InstanceIdEnum> instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public ListAuthorisationsRequest addInstanceIdItem(InstanceIdEnum instanceIdItem) {
        if (this.instanceId == null) {
            this.instanceId = new ArrayList<>();
        }
        this.instanceId.add(instanceIdItem);
        return this;
    }

    public ListAuthorisationsRequest withInstanceId(Consumer<List<InstanceIdEnum>> instanceIdSetter) {
        if (this.instanceId == null) {
            this.instanceId = new ArrayList<>();
        }
        instanceIdSetter.accept(this.instanceId);
        return this;
    }

    /**
     * 根据实例ID过滤授权列表。
     * @return instanceId
     */
    public List<InstanceIdEnum> getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(List<InstanceIdEnum> instanceId) {
        this.instanceId = instanceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAuthorisationsRequest listAuthorisationsRequest = (ListAuthorisationsRequest) o;
        return Objects.equals(this.limit, listAuthorisationsRequest.limit)
            && Objects.equals(this.marker, listAuthorisationsRequest.marker)
            && Objects.equals(this.id, listAuthorisationsRequest.id)
            && Objects.equals(this.name, listAuthorisationsRequest.name)
            && Objects.equals(this.description, listAuthorisationsRequest.description)
            && Objects.equals(this.cloudConnectionId, listAuthorisationsRequest.cloudConnectionId)
            && Objects.equals(this.instanceId, listAuthorisationsRequest.instanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, id, name, description, cloudConnectionId, instanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuthorisationsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    cloudConnectionId: ").append(toIndentedString(cloudConnectionId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
