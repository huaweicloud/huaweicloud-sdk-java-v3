package com.huaweicloud.sdk.sms.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class DeleteTasksReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ids")
    
    private List<String> ids = new ArrayList<>();
    
    public DeleteTasksReq withIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    
    public DeleteTasksReq addIdsItem(String idsItem) {
        this.ids.add(idsItem);
        return this;
    }

    public DeleteTasksReq withIds(Consumer<List<String>> idsSetter) {
        if(this.ids == null ){
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * 待删除的任务id列表
     * @return ids
     */
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteTasksReq deleteTasksReq = (DeleteTasksReq) o;
        return Objects.equals(this.ids, deleteTasksReq.ids);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ids);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTasksReq {\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

