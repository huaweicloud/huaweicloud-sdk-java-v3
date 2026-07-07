package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 本地IDE（如PyCharm、VS Code）或SSH客户端，通过SSH远程接入Notebook实例时需要的相关配置。
 */
public class EndpointsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private String service;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_pair_names")

    private List<String> keyPairNames = null;

    public EndpointsReq withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * **参数解释**：支持的服务。 **约束限制**：不涉及。 **取值范围**：枚举类型，取值如下：  - NOTEBOOK：可以通过https协议访问Notebook。  - SSH：可以通过SSH协议远程连接Notebook。  **默认取值**：不涉及。
     * @return service
     */
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public EndpointsReq withKeyPairNames(List<String> keyPairNames) {
        this.keyPairNames = keyPairNames;
        return this;
    }

    public EndpointsReq addKeyPairNamesItem(String keyPairNamesItem) {
        if (this.keyPairNames == null) {
            this.keyPairNames = new ArrayList<>();
        }
        this.keyPairNames.add(keyPairNamesItem);
        return this;
    }

    public EndpointsReq withKeyPairNames(Consumer<List<String>> keyPairNamesSetter) {
        if (this.keyPairNames == null) {
            this.keyPairNames = new ArrayList<>();
        }
        keyPairNamesSetter.accept(this.keyPairNames);
        return this;
    }

    /**
     * **参数解释**：SSH密钥对名称，可以在云服务器控制台（ECS）“密钥对”页面创建和查看。 **约束限制**：不涉及。
     * @return keyPairNames
     */
    public List<String> getKeyPairNames() {
        return keyPairNames;
    }

    public void setKeyPairNames(List<String> keyPairNames) {
        this.keyPairNames = keyPairNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EndpointsReq that = (EndpointsReq) obj;
        return Objects.equals(this.service, that.service) && Objects.equals(this.keyPairNames, that.keyPairNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(service, keyPairNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EndpointsReq {\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    keyPairNames: ").append(toIndentedString(keyPairNames)).append("\n");
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
