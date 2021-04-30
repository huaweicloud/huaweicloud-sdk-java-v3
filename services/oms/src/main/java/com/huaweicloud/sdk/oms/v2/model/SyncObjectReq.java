package com.huaweicloud.sdk.oms.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 同步事件请求体
 */
public class SyncObjectReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="object_keys")
    
    private List<String> objectKeys = null;
    
    public SyncObjectReq withObjectKeys(List<String> objectKeys) {
        this.objectKeys = objectKeys;
        return this;
    }

    
    public SyncObjectReq addObjectKeysItem(String objectKeysItem) {
        if(this.objectKeys == null) {
            this.objectKeys = new ArrayList<>();
        }
        this.objectKeys.add(objectKeysItem);
        return this;
    }

    public SyncObjectReq withObjectKeys(Consumer<List<String>> objectKeysSetter) {
        if(this.objectKeys == null) {
            this.objectKeys = new ArrayList<>();
        }
        objectKeysSetter.accept(this.objectKeys);
        return this;
    }

    /**
     * 待同步对象的列表,其中待同步对象最大数量为10,列表中object_key为URL编码处理后的结果
     * @return objectKeys
     */
    public List<String> getObjectKeys() {
        return objectKeys;
    }

    public void setObjectKeys(List<String> objectKeys) {
        this.objectKeys = objectKeys;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SyncObjectReq syncObjectReq = (SyncObjectReq) o;
        return Objects.equals(this.objectKeys, syncObjectReq.objectKeys);
    }
    @Override
    public int hashCode() {
        return Objects.hash(objectKeys);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SyncObjectReq {\n");
        sb.append("    objectKeys: ").append(toIndentedString(objectKeys)).append("\n");
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

