package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cce.v3.model.StorageSelectorsMatchLabels;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * StorageSelectors
 */
public class StorageSelectors  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="storageType")
    
    private String storageType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="matchLabels")
    
    private StorageSelectorsMatchLabels matchLabels;

    public StorageSelectors withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * selector的名字，作为storageGroup中selectorNames的索引，因此各个selector间的名字不能重复。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public StorageSelectors withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    


    /**
     * 存储类型，当前仅支持evs（云硬盘）或local（本地盘）；local存储类型不支持磁盘选择，所有本地盘将被组成一个VG，因此也仅允许只有一个local类型的storageSelector。
     * @return storageType
     */
    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    

    public StorageSelectors withMatchLabels(StorageSelectorsMatchLabels matchLabels) {
        this.matchLabels = matchLabels;
        return this;
    }

    public StorageSelectors withMatchLabels(Consumer<StorageSelectorsMatchLabels> matchLabelsSetter) {
        if(this.matchLabels == null ){
            this.matchLabels = new StorageSelectorsMatchLabels();
            matchLabelsSetter.accept(this.matchLabels);
        }
        
        return this;
    }


    /**
     * Get matchLabels
     * @return matchLabels
     */
    public StorageSelectorsMatchLabels getMatchLabels() {
        return matchLabels;
    }

    public void setMatchLabels(StorageSelectorsMatchLabels matchLabels) {
        this.matchLabels = matchLabels;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StorageSelectors storageSelectors = (StorageSelectors) o;
        return Objects.equals(this.name, storageSelectors.name) &&
            Objects.equals(this.storageType, storageSelectors.storageType) &&
            Objects.equals(this.matchLabels, storageSelectors.matchLabels);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, storageType, matchLabels);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StorageSelectors {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    matchLabels: ").append(toIndentedString(matchLabels)).append("\n");
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

