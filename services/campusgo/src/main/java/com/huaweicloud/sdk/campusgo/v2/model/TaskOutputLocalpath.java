package com.huaweicloud.sdk.campusgo.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 输出为localpath类型时的配置信息 */
public class TaskOutputLocalpath {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mount_source_path")

    private String mountSourcePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_category")

    private List<String> dataCategory = null;

    public TaskOutputLocalpath withMountSourcePath(String mountSourcePath) {
        this.mountSourcePath = mountSourcePath;
        return this;
    }

    /** 挂载的源路径，存放作业运行结果的路径，必须为linux路径
     * 
     * @return mountSourcePath */
    public String getMountSourcePath() {
        return mountSourcePath;
    }

    public void setMountSourcePath(String mountSourcePath) {
        this.mountSourcePath = mountSourcePath;
    }

    public TaskOutputLocalpath withDataCategory(List<String> dataCategory) {
        this.dataCategory = dataCategory;
        return this;
    }

    public TaskOutputLocalpath addDataCategoryItem(String dataCategoryItem) {
        if (this.dataCategory == null) {
            this.dataCategory = new ArrayList<>();
        }
        this.dataCategory.add(dataCategoryItem);
        return this;
    }

    public TaskOutputLocalpath withDataCategory(Consumer<List<String>> dataCategorySetter) {
        if (this.dataCategory == null) {
            this.dataCategory = new ArrayList<>();
        }
        dataCategorySetter.accept(this.dataCategory);
        return this;
    }

    /** 作业输出数据类别的列表，当输出类型下有这个列表时，表示希望这个输出类型下存放dataCategory列表内的数据，部分服务需要
     * 
     * @return dataCategory */
    public List<String> getDataCategory() {
        return dataCategory;
    }

    public void setDataCategory(List<String> dataCategory) {
        this.dataCategory = dataCategory;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskOutputLocalpath taskOutputLocalpath = (TaskOutputLocalpath) o;
        return Objects.equals(this.mountSourcePath, taskOutputLocalpath.mountSourcePath)
            && Objects.equals(this.dataCategory, taskOutputLocalpath.dataCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mountSourcePath, dataCategory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskOutputLocalpath {\n");
        sb.append("    mountSourcePath: ").append(toIndentedString(mountSourcePath)).append("\n");
        sb.append("    dataCategory: ").append(toIndentedString(dataCategory)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
