package com.huaweicloud.sdk.elb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.FlavorInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 负载均衡器规格信息
 */
public class Flavor  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="info")
    
    private FlavorInfo info = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="shared")
    
    private Boolean shared;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone_ids")
    
    private List<String> availabilityZoneIds = null;
    
    public Flavor withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 规格ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Flavor withInfo(FlavorInfo info) {
        this.info = info;
        return this;
    }

    public Flavor withInfo(Consumer<FlavorInfo> infoSetter) {
        if(this.info == null ){
            this.info = new FlavorInfo();
            infoSetter.accept(this.info);
        }
        
        return this;
    }


    /**
     * Get info
     * @return info
     */
    public FlavorInfo getInfo() {
        return info;
    }

    public void setInfo(FlavorInfo info) {
        this.info = info;
    }

    public Flavor withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 规格名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flavor withShared(Boolean shared) {
        this.shared = shared;
        return this;
    }

    


    /**
     * 共享。
     * @return shared
     */
    public Boolean getShared() {
        return shared;
    }

    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    public Flavor withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Flavor withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * L4和L7 分别表示四层和七层flavor。查询支持按type过滤
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Flavor withAvailabilityZoneIds(List<String> availabilityZoneIds) {
        this.availabilityZoneIds = availabilityZoneIds;
        return this;
    }

    
    public Flavor addAvailabilityZoneIdsItem(String availabilityZoneIdsItem) {
        if (this.availabilityZoneIds == null) {
            this.availabilityZoneIds = new ArrayList<>();
        }
        this.availabilityZoneIds.add(availabilityZoneIdsItem);
        return this;
    }

    public Flavor withAvailabilityZoneIds(Consumer<List<String>> availabilityZoneIdsSetter) {
        if(this.availabilityZoneIds == null ){
            this.availabilityZoneIds = new ArrayList<>();
        }
        availabilityZoneIdsSetter.accept(this.availabilityZoneIds);
        return this;
    }

    /**
     * availability_zone_ids字段，标志ELB对应L7-flavor在对应可用区是否可以售卖。 若该字段为[]代表该flavor不可售卖；若该字段为[\"ALL\"]，代表所有可用区可售卖；若仅部分可用区可售卖则返回[\"cn-north-1a\",\"cn-north-1b\"]。 可通过/v3/{project_id}/elb/availability-zones接口查询所有可售卖的可用区接口。
     * @return availabilityZoneIds
     */
    public List<String> getAvailabilityZoneIds() {
        return availabilityZoneIds;
    }

    public void setAvailabilityZoneIds(List<String> availabilityZoneIds) {
        this.availabilityZoneIds = availabilityZoneIds;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Flavor flavor = (Flavor) o;
        return Objects.equals(this.id, flavor.id) &&
            Objects.equals(this.info, flavor.info) &&
            Objects.equals(this.name, flavor.name) &&
            Objects.equals(this.shared, flavor.shared) &&
            Objects.equals(this.projectId, flavor.projectId) &&
            Objects.equals(this.type, flavor.type) &&
            Objects.equals(this.availabilityZoneIds, flavor.availabilityZoneIds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, info, name, shared, projectId, type, availabilityZoneIds);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Flavor {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    availabilityZoneIds: ").append(toIndentedString(availabilityZoneIds)).append("\n");
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

