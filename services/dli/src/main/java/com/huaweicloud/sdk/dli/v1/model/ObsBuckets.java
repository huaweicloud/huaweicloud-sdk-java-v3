package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class ObsBuckets {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_buckets")

    @JacksonXmlProperty(localName = "obs_buckets")

    private List<String> obsBuckets = null;

    public ObsBuckets withObsBuckets(List<String> obsBuckets) {
        this.obsBuckets = obsBuckets;
        return this;
    }

    public ObsBuckets addObsBucketsItem(String obsBucketsItem) {
        if (this.obsBuckets == null) {
            this.obsBuckets = new ArrayList<>();
        }
        this.obsBuckets.add(obsBucketsItem);
        return this;
    }

    public ObsBuckets withObsBuckets(Consumer<List<String>> obsBucketsSetter) {
        if (this.obsBuckets == null) {
            this.obsBuckets = new ArrayList<>();
        }
        obsBucketsSetter.accept(this.obsBuckets);
        return this;
    }

    /**
     * 
     * @return obsBuckets
     */
    public List<String> getObsBuckets() {
        return obsBuckets;
    }

    public void setObsBuckets(List<String> obsBuckets) {
        this.obsBuckets = obsBuckets;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ObsBuckets obsBuckets = (ObsBuckets) o;
        return Objects.equals(this.obsBuckets, obsBuckets.obsBuckets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obsBuckets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObsBuckets {\n");
        sb.append("    obsBuckets: ").append(toIndentedString(obsBuckets)).append("\n");
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
