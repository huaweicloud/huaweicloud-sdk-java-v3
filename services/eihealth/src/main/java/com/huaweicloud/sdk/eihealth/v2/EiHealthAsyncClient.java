package com.huaweicloud.sdk.eihealth.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.eihealth.v2.model.ShowAdmetWithCustomPropsRequest;
import com.huaweicloud.sdk.eihealth.v2.model.ShowAdmetWithCustomPropsResponse;

import java.util.concurrent.CompletableFuture;

public class EiHealthAsyncClient {

    protected HcClient hcClient;

    public EiHealthAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EiHealthAsyncClient> newBuilder() {
        ClientBuilder<EiHealthAsyncClient> clientBuilder = new ClientBuilder<>(EiHealthAsyncClient::new);
        return clientBuilder;
    }

    /**
     * ADMET属性预测接口(默认+自定义属性)
     *
     * 计算小分子的物化性质，包括默认的吸收(adsorption)、分布(distribution)、代谢(metabolism)、清除(excretion)与毒性(toxicity)，以及用户自定义的属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAdmetWithCustomPropsRequest 请求对象
     * @return CompletableFuture<ShowAdmetWithCustomPropsResponse>
     */
    public CompletableFuture<ShowAdmetWithCustomPropsResponse> showAdmetWithCustomPropsAsync(
        ShowAdmetWithCustomPropsRequest request) {
        return hcClient.asyncInvokeHttp(request, EiHealthMeta.showAdmetWithCustomProps);
    }

    /**
     * ADMET属性预测接口(默认+自定义属性)
     *
     * 计算小分子的物化性质，包括默认的吸收(adsorption)、分布(distribution)、代谢(metabolism)、清除(excretion)与毒性(toxicity)，以及用户自定义的属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAdmetWithCustomPropsRequest 请求对象
     * @return AsyncInvoker<ShowAdmetWithCustomPropsRequest, ShowAdmetWithCustomPropsResponse>
     */
    public AsyncInvoker<ShowAdmetWithCustomPropsRequest, ShowAdmetWithCustomPropsResponse> showAdmetWithCustomPropsAsyncInvoker(
        ShowAdmetWithCustomPropsRequest request) {
        return new AsyncInvoker<ShowAdmetWithCustomPropsRequest, ShowAdmetWithCustomPropsResponse>(request,
            EiHealthMeta.showAdmetWithCustomProps, hcClient);
    }

}
