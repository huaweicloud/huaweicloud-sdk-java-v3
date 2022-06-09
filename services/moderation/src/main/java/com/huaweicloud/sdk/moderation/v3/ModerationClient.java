package com.huaweicloud.sdk.moderation.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.moderation.v3.model.*;

public class ModerationClient {

    protected HcClient hcClient;

    public ModerationClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ModerationClient> newBuilder() {
        return new ClientBuilder<>(ModerationClient::new);
    }

    /**
     * 文本内容审核
     *
     * 分析并识别用户上传的文本内容是否有敏感内容（如色情、政治等），并将识别结果返回给用户
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunTextModerationRequest 请求对象
     * @return RunTextModerationResponse
     */
    public RunTextModerationResponse runTextModeration(RunTextModerationRequest request) {
        return hcClient.syncInvokeHttp(request, ModerationMeta.runTextModeration);
    }

    /**
     * 文本内容审核
     *
     * 分析并识别用户上传的文本内容是否有敏感内容（如色情、政治等），并将识别结果返回给用户
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunTextModerationRequest 请求对象
     * @return SyncInvoker<RunTextModerationRequest, RunTextModerationResponse>
     */
    public SyncInvoker<RunTextModerationRequest, RunTextModerationResponse> runTextModerationInvoker(
        RunTextModerationRequest request) {
        return new SyncInvoker<RunTextModerationRequest, RunTextModerationResponse>(request,
            ModerationMeta.runTextModeration, hcClient);
    }

}
