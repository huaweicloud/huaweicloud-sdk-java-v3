package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AppBaseResponse
 */
public class AppBaseResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arrange_infos")

    private List<TaskBaseBody> arrangeInfos = null;

    public AppBaseResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 创建的应用id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AppBaseResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 创建应用名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AppBaseResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 应用所属区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public AppBaseResponse withArrangeInfos(List<TaskBaseBody> arrangeInfos) {
        this.arrangeInfos = arrangeInfos;
        return this;
    }

    public AppBaseResponse addArrangeInfosItem(TaskBaseBody arrangeInfosItem) {
        if (this.arrangeInfos == null) {
            this.arrangeInfos = new ArrayList<>();
        }
        this.arrangeInfos.add(arrangeInfosItem);
        return this;
    }

    public AppBaseResponse withArrangeInfos(Consumer<List<TaskBaseBody>> arrangeInfosSetter) {
        if (this.arrangeInfos == null) {
            this.arrangeInfos = new ArrayList<>();
        }
        arrangeInfosSetter.accept(this.arrangeInfos);
        return this;
    }

    /**
     * 部署任务列表
     * @return arrangeInfos
     */
    public List<TaskBaseBody> getArrangeInfos() {
        return arrangeInfos;
    }

    public void setArrangeInfos(List<TaskBaseBody> arrangeInfos) {
        this.arrangeInfos = arrangeInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppBaseResponse that = (AppBaseResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.region, that.region) && Objects.equals(this.arrangeInfos, that.arrangeInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, region, arrangeInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppBaseResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    arrangeInfos: ").append(toIndentedString(arrangeInfos)).append("\n");
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
