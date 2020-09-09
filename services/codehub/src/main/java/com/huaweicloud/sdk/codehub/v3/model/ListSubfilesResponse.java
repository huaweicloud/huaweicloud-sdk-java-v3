package com.huaweicloud.sdk.codehub.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.codehub.v3.model.LogsTree;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListSubfilesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trees")
    
    private List<LogsTree> trees = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public ListSubfilesResponse withTrees(List<LogsTree> trees) {
        this.trees = trees;
        return this;
    }

    
    public ListSubfilesResponse addTreesItem(LogsTree treesItem) {
        if (this.trees == null) {
            this.trees = new ArrayList<>();
        }
        this.trees.add(treesItem);
        return this;
    }

    public ListSubfilesResponse withTrees(Consumer<List<LogsTree>> treesSetter) {
        if(this.trees == null ){
            this.trees = new ArrayList<>();
        }
        treesSetter.accept(this.trees);
        return this;
    }

    /**
     * 文件日志树
     * @return trees
     */
    public List<LogsTree> getTrees() {
        return trees;
    }

    public void setTrees(List<LogsTree> trees) {
        this.trees = trees;
    }

    public ListSubfilesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 记录总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSubfilesResponse listSubfilesResponse = (ListSubfilesResponse) o;
        return Objects.equals(this.trees, listSubfilesResponse.trees) &&
            Objects.equals(this.total, listSubfilesResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(trees, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubfilesResponse {\n");
        sb.append("    trees: ").append(toIndentedString(trees)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

