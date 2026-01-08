package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddressGroupDependency
 */
public class AddressGroupDependency {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependency")

    private List<Dependency> dependency = null;

    public AddressGroupDependency withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： IP地址组的资源ID。IP地址组创建成功后，会生成一个IP地址组 ID，是IP地址组对应的唯一标识。 **取值范围**： 带“-”的标准UUID格式。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AddressGroupDependency withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**： IP地址组所属的企业项目ID。 **取值范围**： 最大长度36字节，带“-”连字符的UUID格式，或者是字符串“0”。“0”表示默认企业项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public AddressGroupDependency withDependency(List<Dependency> dependency) {
        this.dependency = dependency;
        return this;
    }

    public AddressGroupDependency addDependencyItem(Dependency dependencyItem) {
        if (this.dependency == null) {
            this.dependency = new ArrayList<>();
        }
        this.dependency.add(dependencyItem);
        return this;
    }

    public AddressGroupDependency withDependency(Consumer<List<Dependency>> dependencySetter) {
        if (this.dependency == null) {
            this.dependency = new ArrayList<>();
        }
        dependencySetter.accept(this.dependency);
        return this;
    }

    /**
     * **参数解释**： IP地址组关联的资源列表。 **取值范围**： 不涉及。
     * @return dependency
     */
    public List<Dependency> getDependency() {
        return dependency;
    }

    public void setDependency(List<Dependency> dependency) {
        this.dependency = dependency;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddressGroupDependency that = (AddressGroupDependency) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.dependency, that.dependency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, enterpriseProjectId, dependency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddressGroupDependency {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    dependency: ").append(toIndentedString(dependency)).append("\n");
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
