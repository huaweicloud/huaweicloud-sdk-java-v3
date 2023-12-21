package com.huaweicloud.sdk.idmeclassicapi.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCreateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCreateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLogicalUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLogicalUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchShowGetUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchShowGetUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CountUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CountUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CreateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CreateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteByConditionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteByConditionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListSelectUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListSelectUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveAllUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveAllUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveAsUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveAsUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowFindUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowFindUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetByUniqueKeyRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetByUniqueKeyResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteByConditionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteByConditionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowStaticsUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowStaticsUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateByConditionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateByConditionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateUsingPostResponse;

import java.util.concurrent.CompletableFuture;

public class IDMEClassicAPIAsyncClient {

    protected HcClient hcClient;

    public IDMEClassicAPIAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IDMEClassicAPIAsyncClient> newBuilder() {
        ClientBuilder<IDMEClassicAPIAsyncClient> clientBuilder = new ClientBuilder<>(IDMEClassicAPIAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 批量创建实例
     *
     * 批量创建指定数据模型的数据实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateUsingPostRequest 请求对象
     * @return CompletableFuture<BatchCreateUsingPostResponse>
     */
    public CompletableFuture<BatchCreateUsingPostResponse> batchCreateUsingPostAsync(
        BatchCreateUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchCreateUsingPost);
    }

    /**
     * 批量创建实例
     *
     * 批量创建指定数据模型的数据实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateUsingPostRequest 请求对象
     * @return AsyncInvoker<BatchCreateUsingPostRequest, BatchCreateUsingPostResponse>
     */
    public AsyncInvoker<BatchCreateUsingPostRequest, BatchCreateUsingPostResponse> batchCreateUsingPostAsyncInvoker(
        BatchCreateUsingPostRequest request) {
        return new AsyncInvoker<BatchCreateUsingPostRequest, BatchCreateUsingPostResponse>(request,
            IDMEClassicAPIMeta.batchCreateUsingPost, hcClient);
    }

    /**
     * 批量软删除实例
     *
     * 根据数据实例的唯一编码，批量软删除指定数据模型中的多个数据实例。
     * 
     * 通过此接口进行删除操作时，系统会将当前删除的实例转存至XDM应用的XDMLogicDeleteData内置模型中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteLogicalUsingPostRequest 请求对象
     * @return CompletableFuture<BatchDeleteLogicalUsingPostResponse>
     */
    public CompletableFuture<BatchDeleteLogicalUsingPostResponse> batchDeleteLogicalUsingPostAsync(
        BatchDeleteLogicalUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchDeleteLogicalUsingPost);
    }

    /**
     * 批量软删除实例
     *
     * 根据数据实例的唯一编码，批量软删除指定数据模型中的多个数据实例。
     * 
     * 通过此接口进行删除操作时，系统会将当前删除的实例转存至XDM应用的XDMLogicDeleteData内置模型中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteLogicalUsingPostRequest 请求对象
     * @return AsyncInvoker<BatchDeleteLogicalUsingPostRequest, BatchDeleteLogicalUsingPostResponse>
     */
    public AsyncInvoker<BatchDeleteLogicalUsingPostRequest, BatchDeleteLogicalUsingPostResponse> batchDeleteLogicalUsingPostAsyncInvoker(
        BatchDeleteLogicalUsingPostRequest request) {
        return new AsyncInvoker<BatchDeleteLogicalUsingPostRequest, BatchDeleteLogicalUsingPostResponse>(request,
            IDMEClassicAPIMeta.batchDeleteLogicalUsingPost, hcClient);
    }

    /**
     * 批量删除实例
     *
     * 根据数据实例的唯一编码，批量删除指定数据模型中的多个数据实例。
     * 
     * 请您谨慎使用删除操作，实例删除后将无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteUsingPostRequest 请求对象
     * @return CompletableFuture<BatchDeleteUsingPostResponse>
     */
    public CompletableFuture<BatchDeleteUsingPostResponse> batchDeleteUsingPostAsync(
        BatchDeleteUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchDeleteUsingPost);
    }

    /**
     * 批量删除实例
     *
     * 根据数据实例的唯一编码，批量删除指定数据模型中的多个数据实例。
     * 
     * 请您谨慎使用删除操作，实例删除后将无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteUsingPostRequest 请求对象
     * @return AsyncInvoker<BatchDeleteUsingPostRequest, BatchDeleteUsingPostResponse>
     */
    public AsyncInvoker<BatchDeleteUsingPostRequest, BatchDeleteUsingPostResponse> batchDeleteUsingPostAsyncInvoker(
        BatchDeleteUsingPostRequest request) {
        return new AsyncInvoker<BatchDeleteUsingPostRequest, BatchDeleteUsingPostResponse>(request,
            IDMEClassicAPIMeta.batchDeleteUsingPost, hcClient);
    }

    /**
     * 批量查询实例
     *
     * 根据多个数据实例的唯一编码，批量查询实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowGetUsingPostRequest 请求对象
     * @return CompletableFuture<BatchShowGetUsingPostResponse>
     */
    public CompletableFuture<BatchShowGetUsingPostResponse> batchShowGetUsingPostAsync(
        BatchShowGetUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchShowGetUsingPost);
    }

    /**
     * 批量查询实例
     *
     * 根据多个数据实例的唯一编码，批量查询实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowGetUsingPostRequest 请求对象
     * @return AsyncInvoker<BatchShowGetUsingPostRequest, BatchShowGetUsingPostResponse>
     */
    public AsyncInvoker<BatchShowGetUsingPostRequest, BatchShowGetUsingPostResponse> batchShowGetUsingPostAsyncInvoker(
        BatchShowGetUsingPostRequest request) {
        return new AsyncInvoker<BatchShowGetUsingPostRequest, BatchShowGetUsingPostResponse>(request,
            IDMEClassicAPIMeta.batchShowGetUsingPost, hcClient);
    }

    /**
     * 批量更新实例
     *
     * 批量更新指定数据模型中的多个实例数据。如果某个实例的唯一编码不存在，该实例不做任何更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateUsingPostRequest 请求对象
     * @return CompletableFuture<BatchUpdateUsingPostResponse>
     */
    public CompletableFuture<BatchUpdateUsingPostResponse> batchUpdateUsingPostAsync(
        BatchUpdateUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchUpdateUsingPost);
    }

    /**
     * 批量更新实例
     *
     * 批量更新指定数据模型中的多个实例数据。如果某个实例的唯一编码不存在，该实例不做任何更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateUsingPostRequest 请求对象
     * @return AsyncInvoker<BatchUpdateUsingPostRequest, BatchUpdateUsingPostResponse>
     */
    public AsyncInvoker<BatchUpdateUsingPostRequest, BatchUpdateUsingPostResponse> batchUpdateUsingPostAsyncInvoker(
        BatchUpdateUsingPostRequest request) {
        return new AsyncInvoker<BatchUpdateUsingPostRequest, BatchUpdateUsingPostResponse>(request,
            IDMEClassicAPIMeta.batchUpdateUsingPost, hcClient);
    }

    /**
     * 统计指定数据模型的实例总数
     *
     * 根据指定的查询条件，统计指定数据模型中的实例总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountUsingPostRequest 请求对象
     * @return CompletableFuture<CountUsingPostResponse>
     */
    public CompletableFuture<CountUsingPostResponse> countUsingPostAsync(CountUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.countUsingPost);
    }

    /**
     * 统计指定数据模型的实例总数
     *
     * 根据指定的查询条件，统计指定数据模型中的实例总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountUsingPostRequest 请求对象
     * @return AsyncInvoker<CountUsingPostRequest, CountUsingPostResponse>
     */
    public AsyncInvoker<CountUsingPostRequest, CountUsingPostResponse> countUsingPostAsyncInvoker(
        CountUsingPostRequest request) {
        return new AsyncInvoker<CountUsingPostRequest, CountUsingPostResponse>(request,
            IDMEClassicAPIMeta.countUsingPost, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建指定数据模型的数据实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateUsingPostRequest 请求对象
     * @return CompletableFuture<CreateUsingPostResponse>
     */
    public CompletableFuture<CreateUsingPostResponse> createUsingPostAsync(CreateUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.createUsingPost);
    }

    /**
     * 创建实例
     *
     * 创建指定数据模型的数据实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateUsingPostRequest 请求对象
     * @return AsyncInvoker<CreateUsingPostRequest, CreateUsingPostResponse>
     */
    public AsyncInvoker<CreateUsingPostRequest, CreateUsingPostResponse> createUsingPostAsyncInvoker(
        CreateUsingPostRequest request) {
        return new AsyncInvoker<CreateUsingPostRequest, CreateUsingPostResponse>(request,
            IDMEClassicAPIMeta.createUsingPost, hcClient);
    }

    /**
     * 根据指定条件删除实例
     *
     * 通过此接口，删除指定条件查询返回的实例。
     * 
     * 请您谨慎使用删除操作，实例删除后将无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteByConditionUsingPostRequest 请求对象
     * @return CompletableFuture<DeleteByConditionUsingPostResponse>
     */
    public CompletableFuture<DeleteByConditionUsingPostResponse> deleteByConditionUsingPostAsync(
        DeleteByConditionUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.deleteByConditionUsingPost);
    }

    /**
     * 根据指定条件删除实例
     *
     * 通过此接口，删除指定条件查询返回的实例。
     * 
     * 请您谨慎使用删除操作，实例删除后将无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteByConditionUsingPostRequest 请求对象
     * @return AsyncInvoker<DeleteByConditionUsingPostRequest, DeleteByConditionUsingPostResponse>
     */
    public AsyncInvoker<DeleteByConditionUsingPostRequest, DeleteByConditionUsingPostResponse> deleteByConditionUsingPostAsyncInvoker(
        DeleteByConditionUsingPostRequest request) {
        return new AsyncInvoker<DeleteByConditionUsingPostRequest, DeleteByConditionUsingPostResponse>(request,
            IDMEClassicAPIMeta.deleteByConditionUsingPost, hcClient);
    }

    /**
     * 删除实例
     *
     * 根据数据实例的唯一编码，删除指定数据模型中的一个数据实例。
     * 
     * 请您谨慎使用删除操作，实例删除后将无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteUsingPostRequest 请求对象
     * @return CompletableFuture<DeleteUsingPostResponse>
     */
    public CompletableFuture<DeleteUsingPostResponse> deleteUsingPostAsync(DeleteUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.deleteUsingPost);
    }

    /**
     * 删除实例
     *
     * 根据数据实例的唯一编码，删除指定数据模型中的一个数据实例。
     * 
     * 请您谨慎使用删除操作，实例删除后将无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteUsingPostRequest 请求对象
     * @return AsyncInvoker<DeleteUsingPostRequest, DeleteUsingPostResponse>
     */
    public AsyncInvoker<DeleteUsingPostRequest, DeleteUsingPostResponse> deleteUsingPostAsyncInvoker(
        DeleteUsingPostRequest request) {
        return new AsyncInvoker<DeleteUsingPostRequest, DeleteUsingPostResponse>(request,
            IDMEClassicAPIMeta.deleteUsingPost, hcClient);
    }

    /**
     * 根据“列表属性”为“是”的属性查询实例
     *
     * 当数据模型中存在“列表属性”为“是”的属性时，可通过此接口查询数据模型中的实例数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQueryUsingPostRequest 请求对象
     * @return CompletableFuture<ListQueryUsingPostResponse>
     */
    public CompletableFuture<ListQueryUsingPostResponse> listQueryUsingPostAsync(ListQueryUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.listQueryUsingPost);
    }

    /**
     * 根据“列表属性”为“是”的属性查询实例
     *
     * 当数据模型中存在“列表属性”为“是”的属性时，可通过此接口查询数据模型中的实例数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListQueryUsingPostRequest 请求对象
     * @return AsyncInvoker<ListQueryUsingPostRequest, ListQueryUsingPostResponse>
     */
    public AsyncInvoker<ListQueryUsingPostRequest, ListQueryUsingPostResponse> listQueryUsingPostAsyncInvoker(
        ListQueryUsingPostRequest request) {
        return new AsyncInvoker<ListQueryUsingPostRequest, ListQueryUsingPostResponse>(request,
            IDMEClassicAPIMeta.listQueryUsingPost, hcClient);
    }

    /**
     * 查询实例的指定属性
     *
     * 根据查询条件及指定属性分页返回（不支持扩展属性作为选定属性列)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSelectUsingPostRequest 请求对象
     * @return CompletableFuture<ListSelectUsingPostResponse>
     */
    public CompletableFuture<ListSelectUsingPostResponse> listSelectUsingPostAsync(ListSelectUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.listSelectUsingPost);
    }

    /**
     * 查询实例的指定属性
     *
     * 根据查询条件及指定属性分页返回（不支持扩展属性作为选定属性列)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSelectUsingPostRequest 请求对象
     * @return AsyncInvoker<ListSelectUsingPostRequest, ListSelectUsingPostResponse>
     */
    public AsyncInvoker<ListSelectUsingPostRequest, ListSelectUsingPostResponse> listSelectUsingPostAsyncInvoker(
        ListSelectUsingPostRequest request) {
        return new AsyncInvoker<ListSelectUsingPostRequest, ListSelectUsingPostResponse>(request,
            IDMEClassicAPIMeta.listSelectUsingPost, hcClient);
    }

    /**
     * 查询实例的基础属性
     *
     * 根据查询条件分页返回模型基本属性信息且不级联查询（不支持扩展属性作为查询条件）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsingPostRequest 请求对象
     * @return CompletableFuture<ListUsingPostResponse>
     */
    public CompletableFuture<ListUsingPostResponse> listUsingPostAsync(ListUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.listUsingPost);
    }

    /**
     * 查询实例的基础属性
     *
     * 根据查询条件分页返回模型基本属性信息且不级联查询（不支持扩展属性作为查询条件）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsingPostRequest 请求对象
     * @return AsyncInvoker<ListUsingPostRequest, ListUsingPostResponse>
     */
    public AsyncInvoker<ListUsingPostRequest, ListUsingPostResponse> listUsingPostAsyncInvoker(
        ListUsingPostRequest request) {
        return new AsyncInvoker<ListUsingPostRequest, ListUsingPostResponse>(request, IDMEClassicAPIMeta.listUsingPost,
            hcClient);
    }

    /**
     * 根据唯一键为“是”的属性更新实例数据
     *
     * 当数据模型中存在“唯一键”为“是”的属性时，可根据该属性的英文名称更新该数据模型中实例的所有字段数据。如果更新的实例不存在，系统将自动创建该实例数据。
     * 
     * 调用此接口时，建议传入该实例的所有字段信息。如果未传入某个字段，该字段的数据将更新为空值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SaveAllUsingPostRequest 请求对象
     * @return CompletableFuture<SaveAllUsingPostResponse>
     */
    public CompletableFuture<SaveAllUsingPostResponse> saveAllUsingPostAsync(SaveAllUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.saveAllUsingPost);
    }

    /**
     * 根据唯一键为“是”的属性更新实例数据
     *
     * 当数据模型中存在“唯一键”为“是”的属性时，可根据该属性的英文名称更新该数据模型中实例的所有字段数据。如果更新的实例不存在，系统将自动创建该实例数据。
     * 
     * 调用此接口时，建议传入该实例的所有字段信息。如果未传入某个字段，该字段的数据将更新为空值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SaveAllUsingPostRequest 请求对象
     * @return AsyncInvoker<SaveAllUsingPostRequest, SaveAllUsingPostResponse>
     */
    public AsyncInvoker<SaveAllUsingPostRequest, SaveAllUsingPostResponse> saveAllUsingPostAsyncInvoker(
        SaveAllUsingPostRequest request) {
        return new AsyncInvoker<SaveAllUsingPostRequest, SaveAllUsingPostResponse>(request,
            IDMEClassicAPIMeta.saveAllUsingPost, hcClient);
    }

    /**
     * 另存版本对象的实例数据
     *
     * 版本对象的另存为接口（saveAs）用于创建一条与原版本对象实例数据相同的数据实例。该实例数据会完全复制原实例现有的数据，包括与其关联的主对象和分支对象，且新实例数据的版本号从初始值开始计算。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SaveAsUsingPostRequest 请求对象
     * @return CompletableFuture<SaveAsUsingPostResponse>
     */
    public CompletableFuture<SaveAsUsingPostResponse> saveAsUsingPostAsync(SaveAsUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.saveAsUsingPost);
    }

    /**
     * 另存版本对象的实例数据
     *
     * 版本对象的另存为接口（saveAs）用于创建一条与原版本对象实例数据相同的数据实例。该实例数据会完全复制原实例现有的数据，包括与其关联的主对象和分支对象，且新实例数据的版本号从初始值开始计算。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SaveAsUsingPostRequest 请求对象
     * @return AsyncInvoker<SaveAsUsingPostRequest, SaveAsUsingPostResponse>
     */
    public AsyncInvoker<SaveAsUsingPostRequest, SaveAsUsingPostResponse> saveAsUsingPostAsyncInvoker(
        SaveAsUsingPostRequest request) {
        return new AsyncInvoker<SaveAsUsingPostRequest, SaveAsUsingPostResponse>(request,
            IDMEClassicAPIMeta.saveAsUsingPost, hcClient);
    }

    /**
     * 根据唯一键为“是”的属性更新实例的指定字段
     *
     * 当数据模型中存在“唯一键”为“是”的属性时，可根据该属性的英文名称更新该数据模型中实例的指定字段数据。
     * 
     * 如果更新的实例不存在，系统将自动创建该实例数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SaveUsingPostRequest 请求对象
     * @return CompletableFuture<SaveUsingPostResponse>
     */
    public CompletableFuture<SaveUsingPostResponse> saveUsingPostAsync(SaveUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.saveUsingPost);
    }

    /**
     * 根据唯一键为“是”的属性更新实例的指定字段
     *
     * 当数据模型中存在“唯一键”为“是”的属性时，可根据该属性的英文名称更新该数据模型中实例的指定字段数据。
     * 
     * 如果更新的实例不存在，系统将自动创建该实例数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SaveUsingPostRequest 请求对象
     * @return AsyncInvoker<SaveUsingPostRequest, SaveUsingPostResponse>
     */
    public AsyncInvoker<SaveUsingPostRequest, SaveUsingPostResponse> saveUsingPostAsyncInvoker(
        SaveUsingPostRequest request) {
        return new AsyncInvoker<SaveUsingPostRequest, SaveUsingPostResponse>(request, IDMEClassicAPIMeta.saveUsingPost,
            hcClient);
    }

    /**
     * 分页查询实例
     *
     * 分页查询指定数据模型中的所有实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFindUsingPostRequest 请求对象
     * @return CompletableFuture<ShowFindUsingPostResponse>
     */
    public CompletableFuture<ShowFindUsingPostResponse> showFindUsingPostAsync(ShowFindUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showFindUsingPost);
    }

    /**
     * 分页查询实例
     *
     * 分页查询指定数据模型中的所有实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFindUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowFindUsingPostRequest, ShowFindUsingPostResponse>
     */
    public AsyncInvoker<ShowFindUsingPostRequest, ShowFindUsingPostResponse> showFindUsingPostAsyncInvoker(
        ShowFindUsingPostRequest request) {
        return new AsyncInvoker<ShowFindUsingPostRequest, ShowFindUsingPostResponse>(request,
            IDMEClassicAPIMeta.showFindUsingPost, hcClient);
    }

    /**
     * 根据唯一键为“是”的属性查询实例
     *
     * 当数据模型中存在“唯一键”为“是”的属性时，可根据该属性查询实例数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGetByUniqueKeyRequest 请求对象
     * @return CompletableFuture<ShowGetByUniqueKeyResponse>
     */
    public CompletableFuture<ShowGetByUniqueKeyResponse> showGetByUniqueKeyAsync(ShowGetByUniqueKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showGetByUniqueKey);
    }

    /**
     * 根据唯一键为“是”的属性查询实例
     *
     * 当数据模型中存在“唯一键”为“是”的属性时，可根据该属性查询实例数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGetByUniqueKeyRequest 请求对象
     * @return AsyncInvoker<ShowGetByUniqueKeyRequest, ShowGetByUniqueKeyResponse>
     */
    public AsyncInvoker<ShowGetByUniqueKeyRequest, ShowGetByUniqueKeyResponse> showGetByUniqueKeyAsyncInvoker(
        ShowGetByUniqueKeyRequest request) {
        return new AsyncInvoker<ShowGetByUniqueKeyRequest, ShowGetByUniqueKeyResponse>(request,
            IDMEClassicAPIMeta.showGetByUniqueKey, hcClient);
    }

    /**
     * 查询实例
     *
     * 根据一个数据实例的唯一编码，查询实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGetUsingPostRequest 请求对象
     * @return CompletableFuture<ShowGetUsingPostResponse>
     */
    public CompletableFuture<ShowGetUsingPostResponse> showGetUsingPostAsync(ShowGetUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showGetUsingPost);
    }

    /**
     * 查询实例
     *
     * 根据一个数据实例的唯一编码，查询实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowGetUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowGetUsingPostRequest, ShowGetUsingPostResponse>
     */
    public AsyncInvoker<ShowGetUsingPostRequest, ShowGetUsingPostResponse> showGetUsingPostAsyncInvoker(
        ShowGetUsingPostRequest request) {
        return new AsyncInvoker<ShowGetUsingPostRequest, ShowGetUsingPostResponse>(request,
            IDMEClassicAPIMeta.showGetUsingPost, hcClient);
    }

    /**
     * 根据指定条件软删除实例
     *
     * 通过此接口，软删除指定条件查询返回的实例。
     * 
     * 通过此接口进行删除操作时，系统会将当前删除的实例转存至XDM应用的XDMLogicDeleteData内置模型中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLogicalDeleteByConditionUsingPostRequest 请求对象
     * @return CompletableFuture<ShowLogicalDeleteByConditionUsingPostResponse>
     */
    public CompletableFuture<ShowLogicalDeleteByConditionUsingPostResponse> showLogicalDeleteByConditionUsingPostAsync(
        ShowLogicalDeleteByConditionUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showLogicalDeleteByConditionUsingPost);
    }

    /**
     * 根据指定条件软删除实例
     *
     * 通过此接口，软删除指定条件查询返回的实例。
     * 
     * 通过此接口进行删除操作时，系统会将当前删除的实例转存至XDM应用的XDMLogicDeleteData内置模型中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLogicalDeleteByConditionUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowLogicalDeleteByConditionUsingPostRequest, ShowLogicalDeleteByConditionUsingPostResponse>
     */
    public AsyncInvoker<ShowLogicalDeleteByConditionUsingPostRequest, ShowLogicalDeleteByConditionUsingPostResponse> showLogicalDeleteByConditionUsingPostAsyncInvoker(
        ShowLogicalDeleteByConditionUsingPostRequest request) {
        return new AsyncInvoker<ShowLogicalDeleteByConditionUsingPostRequest, ShowLogicalDeleteByConditionUsingPostResponse>(
            request, IDMEClassicAPIMeta.showLogicalDeleteByConditionUsingPost, hcClient);
    }

    /**
     * 软删除实例
     *
     * 根据数据实例的唯一编码，软删除指定数据模型中的一个数据实例。
     * 
     * 通过此接口进行删除操作时，系统会将当前删除的实例转存至XDM应用的XDMLogicDeleteData内置模型中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLogicalDeleteUsingPostRequest 请求对象
     * @return CompletableFuture<ShowLogicalDeleteUsingPostResponse>
     */
    public CompletableFuture<ShowLogicalDeleteUsingPostResponse> showLogicalDeleteUsingPostAsync(
        ShowLogicalDeleteUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showLogicalDeleteUsingPost);
    }

    /**
     * 软删除实例
     *
     * 根据数据实例的唯一编码，软删除指定数据模型中的一个数据实例。
     * 
     * 通过此接口进行删除操作时，系统会将当前删除的实例转存至XDM应用的XDMLogicDeleteData内置模型中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLogicalDeleteUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowLogicalDeleteUsingPostRequest, ShowLogicalDeleteUsingPostResponse>
     */
    public AsyncInvoker<ShowLogicalDeleteUsingPostRequest, ShowLogicalDeleteUsingPostResponse> showLogicalDeleteUsingPostAsyncInvoker(
        ShowLogicalDeleteUsingPostRequest request) {
        return new AsyncInvoker<ShowLogicalDeleteUsingPostRequest, ShowLogicalDeleteUsingPostResponse>(request,
            IDMEClassicAPIMeta.showLogicalDeleteUsingPost, hcClient);
    }

    /**
     * 查询指定数据模型的实例统计信息
     *
     * 根据指定函数，统计指定数据模型的实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStaticsUsingPostRequest 请求对象
     * @return CompletableFuture<ShowStaticsUsingPostResponse>
     */
    public CompletableFuture<ShowStaticsUsingPostResponse> showStaticsUsingPostAsync(
        ShowStaticsUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showStaticsUsingPost);
    }

    /**
     * 查询指定数据模型的实例统计信息
     *
     * 根据指定函数，统计指定数据模型的实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStaticsUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowStaticsUsingPostRequest, ShowStaticsUsingPostResponse>
     */
    public AsyncInvoker<ShowStaticsUsingPostRequest, ShowStaticsUsingPostResponse> showStaticsUsingPostAsyncInvoker(
        ShowStaticsUsingPostRequest request) {
        return new AsyncInvoker<ShowStaticsUsingPostRequest, ShowStaticsUsingPostResponse>(request,
            IDMEClassicAPIMeta.showStaticsUsingPost, hcClient);
    }

    /**
     * 根据指定条件更新实例
     *
     * 根据指定条件更新指定模型的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateByConditionUsingPostRequest 请求对象
     * @return CompletableFuture<UpdateByConditionUsingPostResponse>
     */
    public CompletableFuture<UpdateByConditionUsingPostResponse> updateByConditionUsingPostAsync(
        UpdateByConditionUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.updateByConditionUsingPost);
    }

    /**
     * 根据指定条件更新实例
     *
     * 根据指定条件更新指定模型的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateByConditionUsingPostRequest 请求对象
     * @return AsyncInvoker<UpdateByConditionUsingPostRequest, UpdateByConditionUsingPostResponse>
     */
    public AsyncInvoker<UpdateByConditionUsingPostRequest, UpdateByConditionUsingPostResponse> updateByConditionUsingPostAsyncInvoker(
        UpdateByConditionUsingPostRequest request) {
        return new AsyncInvoker<UpdateByConditionUsingPostRequest, UpdateByConditionUsingPostResponse>(request,
            IDMEClassicAPIMeta.updateByConditionUsingPost, hcClient);
    }

    /**
     * 更新实例
     *
     * 更新指定数据模型中的一个实例数据。如果实例的唯一编码不存在，则不做任何更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUsingPostRequest 请求对象
     * @return CompletableFuture<UpdateUsingPostResponse>
     */
    public CompletableFuture<UpdateUsingPostResponse> updateUsingPostAsync(UpdateUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.updateUsingPost);
    }

    /**
     * 更新实例
     *
     * 更新指定数据模型中的一个实例数据。如果实例的唯一编码不存在，则不做任何更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateUsingPostRequest 请求对象
     * @return AsyncInvoker<UpdateUsingPostRequest, UpdateUsingPostResponse>
     */
    public AsyncInvoker<UpdateUsingPostRequest, UpdateUsingPostResponse> updateUsingPostAsyncInvoker(
        UpdateUsingPostRequest request) {
        return new AsyncInvoker<UpdateUsingPostRequest, UpdateUsingPostResponse>(request,
            IDMEClassicAPIMeta.updateUsingPost, hcClient);
    }

}
