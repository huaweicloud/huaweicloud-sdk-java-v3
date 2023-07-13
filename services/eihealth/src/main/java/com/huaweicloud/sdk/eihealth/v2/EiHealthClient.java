package com.huaweicloud.sdk.eihealth.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.eihealth.v2.model.*;

public class EiHealthClient {

    protected HcClient hcClient;

    public EiHealthClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EiHealthClient> newBuilder() {
        return new ClientBuilder<>(EiHealthClient::new);
    }

    /**
     * ADMET属性预测接口(默认+自定义属性)
     *
     * 计算小分子的物化性质，包括默认的吸收(adsorption)、分布(distribution)、代谢(metabolism)、清除(excretion)与毒性(toxicity)，以及用户自定义的属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAdmetWithCustomPropsRequest 请求对象
     * @return ShowAdmetWithCustomPropsResponse
     */
    public ShowAdmetWithCustomPropsResponse showAdmetWithCustomProps(ShowAdmetWithCustomPropsRequest request) {
        return hcClient.syncInvokeHttp(request, EiHealthMeta.showAdmetWithCustomProps);
    }

    /**
     * ADMET属性预测接口(默认+自定义属性)
     *
     * 计算小分子的物化性质，包括默认的吸收(adsorption)、分布(distribution)、代谢(metabolism)、清除(excretion)与毒性(toxicity)，以及用户自定义的属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAdmetWithCustomPropsRequest 请求对象
     * @return SyncInvoker<ShowAdmetWithCustomPropsRequest, ShowAdmetWithCustomPropsResponse>
     */
    public SyncInvoker<ShowAdmetWithCustomPropsRequest, ShowAdmetWithCustomPropsResponse> showAdmetWithCustomPropsInvoker(
        ShowAdmetWithCustomPropsRequest request) {
        return new SyncInvoker<ShowAdmetWithCustomPropsRequest, ShowAdmetWithCustomPropsResponse>(request,
            EiHealthMeta.showAdmetWithCustomProps, hcClient);
    }

}
