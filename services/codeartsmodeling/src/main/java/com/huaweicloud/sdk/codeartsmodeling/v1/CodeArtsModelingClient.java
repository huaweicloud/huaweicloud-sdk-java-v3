package com.huaweicloud.sdk.codeartsmodeling.v1;

import com.huaweicloud.sdk.codeartsmodeling.v1.model.ConvertPlantUml2DiagramRequest;
import com.huaweicloud.sdk.codeartsmodeling.v1.model.ConvertPlantUml2DiagramResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CodeArtsModelingClient {

    protected HcClient hcClient;

    public CodeArtsModelingClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeArtsModelingClient> newBuilder() {
        ClientBuilder<CodeArtsModelingClient> clientBuilder = new ClientBuilder<>(CodeArtsModelingClient::new);
        return clientBuilder;
    }

    /**
     * 将plantuml代码转换成CM模型图
     *
     * 将plantuml代码转换成CM模型图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConvertPlantUml2DiagramRequest 请求对象
     * @return ConvertPlantUml2DiagramResponse
     */
    public ConvertPlantUml2DiagramResponse convertPlantUml2Diagram(ConvertPlantUml2DiagramRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsModelingMeta.convertPlantUml2Diagram);
    }

    /**
     * 将plantuml代码转换成CM模型图
     *
     * 将plantuml代码转换成CM模型图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConvertPlantUml2DiagramRequest 请求对象
     * @return SyncInvoker<ConvertPlantUml2DiagramRequest, ConvertPlantUml2DiagramResponse>
     */
    public SyncInvoker<ConvertPlantUml2DiagramRequest, ConvertPlantUml2DiagramResponse> convertPlantUml2DiagramInvoker(
        ConvertPlantUml2DiagramRequest request) {
        return new SyncInvoker<>(request, CodeArtsModelingMeta.convertPlantUml2Diagram, hcClient);
    }

}
