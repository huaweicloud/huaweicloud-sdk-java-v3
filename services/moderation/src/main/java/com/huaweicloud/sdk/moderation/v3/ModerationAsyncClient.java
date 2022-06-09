package com.huaweicloud.sdk.moderation.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.moderation.v3.model.*;

import java.util.concurrent.CompletableFuture;

public class ModerationAsyncClient {

    protected HcClient hcClient;

    public ModerationAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ModerationAsyncClient> newBuilder() {
        return new ClientBuilder<>(ModerationAsyncClient::new);
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
     * @return CompletableFuture<RunTextModerationResponse>
     */
    public CompletableFuture<RunTextModerationResponse> runTextModerationAsync(RunTextModerationRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.runTextModeration);
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
     * @return AsyncInvoker<RunTextModerationRequest, RunTextModerationResponse>
     */
    public AsyncInvoker<RunTextModerationRequest, RunTextModerationResponse> runTextModerationAsyncInvoker(
        RunTextModerationRequest request) {
        return new AsyncInvoker<RunTextModerationRequest, RunTextModerationResponse>(request,
            ModerationMeta.runTextModeration, hcClient);
    }

}
