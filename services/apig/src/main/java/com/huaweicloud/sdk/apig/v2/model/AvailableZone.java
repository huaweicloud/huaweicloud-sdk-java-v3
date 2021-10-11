package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** AvailableZone */
public class AvailableZone {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_name")

    private LocalName localName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specs")

    private Map<String, Boolean> specs = null;

    public AvailableZone withName(String name) {
        this.name = name;
        return this;
    }

    /** 可用区名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AvailableZone withId(String id) {
        this.id = id;
        return this;
    }

    /** 实例创建失败错误信息
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AvailableZone withCode(String code) {
        this.code = code;
        return this;
    }

    /** 可用区编码。
     * 
     * @return code */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public AvailableZone withPort(String port) {
        this.port = port;
        return this;
    }

    /** 可用区端口号。
     * 
     * @return port */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public AvailableZone withLocalName(LocalName localName) {
        this.localName = localName;
        return this;
    }

    public AvailableZone withLocalName(Consumer<LocalName> localNameSetter) {
        if (this.localName == null) {
            this.localName = new LocalName();
            localNameSetter.accept(this.localName);
        }

        return this;
    }

    /** Get localName
     * 
     * @return localName */
    public LocalName getLocalName() {
        return localName;
    }

    public void setLocalName(LocalName localName) {
        this.localName = localName;
    }

    public AvailableZone withSpecs(Map<String, Boolean> specs) {
        this.specs = specs;
        return this;
    }

    public AvailableZone putSpecsItem(String key, Boolean specsItem) {
        if (this.specs == null) {
            this.specs = new HashMap<>();
        }
        this.specs.put(key, specsItem);
        return this;
    }

    public AvailableZone withSpecs(Consumer<Map<String, Boolean>> specsSetter) {
        if (this.specs == null) {
            this.specs = new HashMap<>();
        }
        specsSetter.accept(this.specs);
        return this;
    }

    /** 可用区支持的实例规格。
     * 
     * @return specs */
    public Map<String, Boolean> getSpecs() {
        return specs;
    }

    public void setSpecs(Map<String, Boolean> specs) {
        this.specs = specs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AvailableZone availableZone = (AvailableZone) o;
        return Objects.equals(this.name, availableZone.name) && Objects.equals(this.id, availableZone.id)
            && Objects.equals(this.code, availableZone.code) && Objects.equals(this.port, availableZone.port)
            && Objects.equals(this.localName, availableZone.localName)
            && Objects.equals(this.specs, availableZone.specs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, code, port, localName, specs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvailableZone {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    localName: ").append(toIndentedString(localName)).append("\n");
        sb.append("    specs: ").append(toIndentedString(specs)).append("\n");
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
