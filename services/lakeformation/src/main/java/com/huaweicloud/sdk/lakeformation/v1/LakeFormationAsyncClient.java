package com.huaweicloud.sdk.lakeformation.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.lakeformation.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class LakeFormationAsyncClient {

    protected HcClient hcClient;

    public LakeFormationAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<LakeFormationAsyncClient> newBuilder() {
        return new ClientBuilder<>(LakeFormationAsyncClient::new);
    }

    /**
     * 申请接入服务
     *
     * 申请接入服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyForAccessRequest 请求对象
     * @return CompletableFuture<ApplyForAccessResponse>
     */
    public CompletableFuture<ApplyForAccessResponse> applyForAccessAsync(ApplyForAccessRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.applyForAccess);
    }

    /**
     * 申请接入服务
     *
     * 申请接入服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyForAccessRequest 请求对象
     * @return AsyncInvoker<ApplyForAccessRequest, ApplyForAccessResponse>
     */
    public AsyncInvoker<ApplyForAccessRequest, ApplyForAccessResponse> applyForAccessAsyncInvoker(
        ApplyForAccessRequest request) {
        return new AsyncInvoker<ApplyForAccessRequest, ApplyForAccessResponse>(request,
            LakeFormationMeta.applyForAccess, hcClient);
    }

    /**
     * 批量授权
     *
     * 批量授权接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAuthorizeInterfaceRequest 请求对象
     * @return CompletableFuture<BatchAuthorizeInterfaceResponse>
     */
    public CompletableFuture<BatchAuthorizeInterfaceResponse> batchAuthorizeInterfaceAsync(
        BatchAuthorizeInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.batchAuthorizeInterface);
    }

    /**
     * 批量授权
     *
     * 批量授权接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAuthorizeInterfaceRequest 请求对象
     * @return AsyncInvoker<BatchAuthorizeInterfaceRequest, BatchAuthorizeInterfaceResponse>
     */
    public AsyncInvoker<BatchAuthorizeInterfaceRequest, BatchAuthorizeInterfaceResponse> batchAuthorizeInterfaceAsyncInvoker(
        BatchAuthorizeInterfaceRequest request) {
        return new AsyncInvoker<BatchAuthorizeInterfaceRequest, BatchAuthorizeInterfaceResponse>(request,
            LakeFormationMeta.batchAuthorizeInterface, hcClient);
    }

    /**
     * 取消批量授权
     *
     * 批量取消授权接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCancelAuthorizationInterfaceRequest 请求对象
     * @return CompletableFuture<BatchCancelAuthorizationInterfaceResponse>
     */
    public CompletableFuture<BatchCancelAuthorizationInterfaceResponse> batchCancelAuthorizationInterfaceAsync(
        BatchCancelAuthorizationInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.batchCancelAuthorizationInterface);
    }

    /**
     * 取消批量授权
     *
     * 批量取消授权接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCancelAuthorizationInterfaceRequest 请求对象
     * @return AsyncInvoker<BatchCancelAuthorizationInterfaceRequest, BatchCancelAuthorizationInterfaceResponse>
     */
    public AsyncInvoker<BatchCancelAuthorizationInterfaceRequest, BatchCancelAuthorizationInterfaceResponse> batchCancelAuthorizationInterfaceAsyncInvoker(
        BatchCancelAuthorizationInterfaceRequest request) {
        return new AsyncInvoker<BatchCancelAuthorizationInterfaceRequest, BatchCancelAuthorizationInterfaceResponse>(
            request, LakeFormationMeta.batchCancelAuthorizationInterface, hcClient);
    }

    /**
     * 获取服务接入信息
     *
     * 根据LakeFormation实例获取服务实例相关的接入信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccessInfosRequest 请求对象
     * @return CompletableFuture<ListAccessInfosResponse>
     */
    public CompletableFuture<ListAccessInfosResponse> listAccessInfosAsync(ListAccessInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listAccessInfos);
    }

    /**
     * 获取服务接入信息
     *
     * 根据LakeFormation实例获取服务实例相关的接入信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccessInfosRequest 请求对象
     * @return AsyncInvoker<ListAccessInfosRequest, ListAccessInfosResponse>
     */
    public AsyncInvoker<ListAccessInfosRequest, ListAccessInfosResponse> listAccessInfosAsyncInvoker(
        ListAccessInfosRequest request) {
        return new AsyncInvoker<ListAccessInfosRequest, ListAccessInfosResponse>(request,
            LakeFormationMeta.listAccessInfos, hcClient);
    }

    /**
     * 查询策略
     *
     * 通过过滤条件查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInterfacesRequest 请求对象
     * @return CompletableFuture<ListInterfacesResponse>
     */
    public CompletableFuture<ListInterfacesResponse> listInterfacesAsync(ListInterfacesRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listInterfaces);
    }

    /**
     * 查询策略
     *
     * 通过过滤条件查询接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInterfacesRequest 请求对象
     * @return AsyncInvoker<ListInterfacesRequest, ListInterfacesResponse>
     */
    public AsyncInvoker<ListInterfacesRequest, ListInterfacesResponse> listInterfacesAsyncInvoker(
        ListInterfacesRequest request) {
        return new AsyncInvoker<ListInterfacesRequest, ListInterfacesResponse>(request,
            LakeFormationMeta.listInterfaces, hcClient);
    }

    /**
     * 获取同步权限策略
     *
     * 分页获取同步权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPolicyRequest 请求对象
     * @return CompletableFuture<ListPolicyResponse>
     */
    public CompletableFuture<ListPolicyResponse> listPolicyAsync(ListPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listPolicy);
    }

    /**
     * 获取同步权限策略
     *
     * 分页获取同步权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPolicyRequest 请求对象
     * @return AsyncInvoker<ListPolicyRequest, ListPolicyResponse>
     */
    public AsyncInvoker<ListPolicyRequest, ListPolicyResponse> listPolicyAsyncInvoker(ListPolicyRequest request) {
        return new AsyncInvoker<ListPolicyRequest, ListPolicyResponse>(request, LakeFormationMeta.listPolicy, hcClient);
    }

    /**
     * 获取同步权限策略
     *
     * 获取同步权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSyncPolicyRequest 请求对象
     * @return CompletableFuture<ShowSyncPolicyResponse>
     */
    public CompletableFuture<ShowSyncPolicyResponse> showSyncPolicyAsync(ShowSyncPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.showSyncPolicy);
    }

    /**
     * 获取同步权限策略
     *
     * 获取同步权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSyncPolicyRequest 请求对象
     * @return AsyncInvoker<ShowSyncPolicyRequest, ShowSyncPolicyResponse>
     */
    public AsyncInvoker<ShowSyncPolicyRequest, ShowSyncPolicyResponse> showSyncPolicyAsyncInvoker(
        ShowSyncPolicyRequest request) {
        return new AsyncInvoker<ShowSyncPolicyRequest, ShowSyncPolicyResponse>(request,
            LakeFormationMeta.showSyncPolicy, hcClient);
    }

    /**
     * 创建catalog
     *
     * 创建catalog，会在catalog下创建默认数据库，默认数据库名字为：default
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCatalogRequest 请求对象
     * @return CompletableFuture<CreateCatalogResponse>
     */
    public CompletableFuture<CreateCatalogResponse> createCatalogAsync(CreateCatalogRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.createCatalog);
    }

    /**
     * 创建catalog
     *
     * 创建catalog，会在catalog下创建默认数据库，默认数据库名字为：default
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCatalogRequest 请求对象
     * @return AsyncInvoker<CreateCatalogRequest, CreateCatalogResponse>
     */
    public AsyncInvoker<CreateCatalogRequest, CreateCatalogResponse> createCatalogAsyncInvoker(
        CreateCatalogRequest request) {
        return new AsyncInvoker<CreateCatalogRequest, CreateCatalogResponse>(request, LakeFormationMeta.createCatalog,
            hcClient);
    }

    /**
     * 删除catalog对象
     *
     * 删除空的catalog对象。
     * 删除前需要保证catalog下只有默认的数据库，且默认数据库下没有表对象，否则删除失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCatalogRequest 请求对象
     * @return CompletableFuture<DeleteCatalogResponse>
     */
    public CompletableFuture<DeleteCatalogResponse> deleteCatalogAsync(DeleteCatalogRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.deleteCatalog);
    }

    /**
     * 删除catalog对象
     *
     * 删除空的catalog对象。
     * 删除前需要保证catalog下只有默认的数据库，且默认数据库下没有表对象，否则删除失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCatalogRequest 请求对象
     * @return AsyncInvoker<DeleteCatalogRequest, DeleteCatalogResponse>
     */
    public AsyncInvoker<DeleteCatalogRequest, DeleteCatalogResponse> deleteCatalogAsyncInvoker(
        DeleteCatalogRequest request) {
        return new AsyncInvoker<DeleteCatalogRequest, DeleteCatalogResponse>(request, LakeFormationMeta.deleteCatalog,
            hcClient);
    }

    /**
     * 列举catalog信息
     *
     * 根据catalog名字的通配符列举catalog的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCatalogsRequest 请求对象
     * @return CompletableFuture<ListCatalogsResponse>
     */
    public CompletableFuture<ListCatalogsResponse> listCatalogsAsync(ListCatalogsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listCatalogs);
    }

    /**
     * 列举catalog信息
     *
     * 根据catalog名字的通配符列举catalog的详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCatalogsRequest 请求对象
     * @return AsyncInvoker<ListCatalogsRequest, ListCatalogsResponse>
     */
    public AsyncInvoker<ListCatalogsRequest, ListCatalogsResponse> listCatalogsAsyncInvoker(
        ListCatalogsRequest request) {
        return new AsyncInvoker<ListCatalogsRequest, ListCatalogsResponse>(request, LakeFormationMeta.listCatalogs,
            hcClient);
    }

    /**
     * 获取catalog信息
     *
     * 获取catalog信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCatalogRequest 请求对象
     * @return CompletableFuture<ShowCatalogResponse>
     */
    public CompletableFuture<ShowCatalogResponse> showCatalogAsync(ShowCatalogRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.showCatalog);
    }

    /**
     * 获取catalog信息
     *
     * 获取catalog信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCatalogRequest 请求对象
     * @return AsyncInvoker<ShowCatalogRequest, ShowCatalogResponse>
     */
    public AsyncInvoker<ShowCatalogRequest, ShowCatalogResponse> showCatalogAsyncInvoker(ShowCatalogRequest request) {
        return new AsyncInvoker<ShowCatalogRequest, ShowCatalogResponse>(request, LakeFormationMeta.showCatalog,
            hcClient);
    }

    /**
     * 修改catalog信息
     *
     * 修改catalog信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCatalogRequest 请求对象
     * @return CompletableFuture<UpdateCatalogResponse>
     */
    public CompletableFuture<UpdateCatalogResponse> updateCatalogAsync(UpdateCatalogRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.updateCatalog);
    }

    /**
     * 修改catalog信息
     *
     * 修改catalog信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCatalogRequest 请求对象
     * @return AsyncInvoker<UpdateCatalogRequest, UpdateCatalogResponse>
     */
    public AsyncInvoker<UpdateCatalogRequest, UpdateCatalogResponse> updateCatalogAsyncInvoker(
        UpdateCatalogRequest request) {
        return new AsyncInvoker<UpdateCatalogRequest, UpdateCatalogResponse>(request, LakeFormationMeta.updateCatalog,
            hcClient);
    }

    /**
     * 创建数据库
     *
     * 创建数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseRequest 请求对象
     * @return CompletableFuture<CreateDatabaseResponse>
     */
    public CompletableFuture<CreateDatabaseResponse> createDatabaseAsync(CreateDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.createDatabase);
    }

    /**
     * 创建数据库
     *
     * 创建数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDatabaseRequest 请求对象
     * @return AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>
     */
    public AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse> createDatabaseAsyncInvoker(
        CreateDatabaseRequest request) {
        return new AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>(request,
            LakeFormationMeta.createDatabase, hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除指定数据库，catalog的默认数据库不允许删除。
     * cascade: 指定为true时，删除数据库下的表；指定为false时，只能删除空的数据库
     * delete_data: 指定为true时，级联删除会将表的数据放入回收站；指定为false时，不删除表数据
     * 删除数据库后不支持恢复数据库下的事务表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return CompletableFuture<DeleteDatabaseResponse>
     */
    public CompletableFuture<DeleteDatabaseResponse> deleteDatabaseAsync(DeleteDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.deleteDatabase);
    }

    /**
     * 删除数据库
     *
     * 删除指定数据库，catalog的默认数据库不允许删除。
     * cascade: 指定为true时，删除数据库下的表；指定为false时，只能删除空的数据库
     * delete_data: 指定为true时，级联删除会将表的数据放入回收站；指定为false时，不删除表数据
     * 删除数据库后不支持恢复数据库下的事务表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>
     */
    public AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabaseAsyncInvoker(
        DeleteDatabaseRequest request) {
        return new AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>(request,
            LakeFormationMeta.deleteDatabase, hcClient);
    }

    /**
     * 列举数据库名称信息
     *
     * 列举数据库名称信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseNamesRequest 请求对象
     * @return CompletableFuture<ListDatabaseNamesResponse>
     */
    public CompletableFuture<ListDatabaseNamesResponse> listDatabaseNamesAsync(ListDatabaseNamesRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listDatabaseNames);
    }

    /**
     * 列举数据库名称信息
     *
     * 列举数据库名称信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabaseNamesRequest 请求对象
     * @return AsyncInvoker<ListDatabaseNamesRequest, ListDatabaseNamesResponse>
     */
    public AsyncInvoker<ListDatabaseNamesRequest, ListDatabaseNamesResponse> listDatabaseNamesAsyncInvoker(
        ListDatabaseNamesRequest request) {
        return new AsyncInvoker<ListDatabaseNamesRequest, ListDatabaseNamesResponse>(request,
            LakeFormationMeta.listDatabaseNames, hcClient);
    }

    /**
     * 列举数据库信息
     *
     * 列举数据库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabasesRequest 请求对象
     * @return CompletableFuture<ListDatabasesResponse>
     */
    public CompletableFuture<ListDatabasesResponse> listDatabasesAsync(ListDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listDatabases);
    }

    /**
     * 列举数据库信息
     *
     * 列举数据库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatabasesRequest 请求对象
     * @return AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse>
     */
    public AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse> listDatabasesAsyncInvoker(
        ListDatabasesRequest request) {
        return new AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse>(request, LakeFormationMeta.listDatabases,
            hcClient);
    }

    /**
     * 获取数据库
     *
     * 获取数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDatabaseRequest 请求对象
     * @return CompletableFuture<ShowDatabaseResponse>
     */
    public CompletableFuture<ShowDatabaseResponse> showDatabaseAsync(ShowDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.showDatabase);
    }

    /**
     * 获取数据库
     *
     * 获取数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDatabaseRequest 请求对象
     * @return AsyncInvoker<ShowDatabaseRequest, ShowDatabaseResponse>
     */
    public AsyncInvoker<ShowDatabaseRequest, ShowDatabaseResponse> showDatabaseAsyncInvoker(
        ShowDatabaseRequest request) {
        return new AsyncInvoker<ShowDatabaseRequest, ShowDatabaseResponse>(request, LakeFormationMeta.showDatabase,
            hcClient);
    }

    /**
     * 修改数据库属性
     *
     * 修改数据库属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDatabaseRequest 请求对象
     * @return CompletableFuture<UpdateDatabaseResponse>
     */
    public CompletableFuture<UpdateDatabaseResponse> updateDatabaseAsync(UpdateDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.updateDatabase);
    }

    /**
     * 修改数据库属性
     *
     * 修改数据库属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDatabaseRequest 请求对象
     * @return AsyncInvoker<UpdateDatabaseRequest, UpdateDatabaseResponse>
     */
    public AsyncInvoker<UpdateDatabaseRequest, UpdateDatabaseResponse> updateDatabaseAsyncInvoker(
        UpdateDatabaseRequest request) {
        return new AsyncInvoker<UpdateDatabaseRequest, UpdateDatabaseResponse>(request,
            LakeFormationMeta.updateDatabase, hcClient);
    }

    /**
     * 创建函数
     *
     * 创建函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFunctionRequest 请求对象
     * @return CompletableFuture<CreateFunctionResponse>
     */
    public CompletableFuture<CreateFunctionResponse> createFunctionAsync(CreateFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.createFunction);
    }

    /**
     * 创建函数
     *
     * 创建函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFunctionRequest 请求对象
     * @return AsyncInvoker<CreateFunctionRequest, CreateFunctionResponse>
     */
    public AsyncInvoker<CreateFunctionRequest, CreateFunctionResponse> createFunctionAsyncInvoker(
        CreateFunctionRequest request) {
        return new AsyncInvoker<CreateFunctionRequest, CreateFunctionResponse>(request,
            LakeFormationMeta.createFunction, hcClient);
    }

    /**
     * 删除函数
     *
     * 删除函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFunctionRequest 请求对象
     * @return CompletableFuture<DeleteFunctionResponse>
     */
    public CompletableFuture<DeleteFunctionResponse> deleteFunctionAsync(DeleteFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.deleteFunction);
    }

    /**
     * 删除函数
     *
     * 删除函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFunctionRequest 请求对象
     * @return AsyncInvoker<DeleteFunctionRequest, DeleteFunctionResponse>
     */
    public AsyncInvoker<DeleteFunctionRequest, DeleteFunctionResponse> deleteFunctionAsyncInvoker(
        DeleteFunctionRequest request) {
        return new AsyncInvoker<DeleteFunctionRequest, DeleteFunctionResponse>(request,
            LakeFormationMeta.deleteFunction, hcClient);
    }

    /**
     * 列举catalog下所有的函数
     *
     * 获取catalog下所有的函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllFunctionsRequest 请求对象
     * @return CompletableFuture<ListAllFunctionsResponse>
     */
    public CompletableFuture<ListAllFunctionsResponse> listAllFunctionsAsync(ListAllFunctionsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listAllFunctions);
    }

    /**
     * 列举catalog下所有的函数
     *
     * 获取catalog下所有的函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAllFunctionsRequest 请求对象
     * @return AsyncInvoker<ListAllFunctionsRequest, ListAllFunctionsResponse>
     */
    public AsyncInvoker<ListAllFunctionsRequest, ListAllFunctionsResponse> listAllFunctionsAsyncInvoker(
        ListAllFunctionsRequest request) {
        return new AsyncInvoker<ListAllFunctionsRequest, ListAllFunctionsResponse>(request,
            LakeFormationMeta.listAllFunctions, hcClient);
    }

    /**
     * 列举函数
     *
     * 列举函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionsRequest 请求对象
     * @return CompletableFuture<ListFunctionsResponse>
     */
    public CompletableFuture<ListFunctionsResponse> listFunctionsAsync(ListFunctionsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listFunctions);
    }

    /**
     * 列举函数
     *
     * 列举函数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFunctionsRequest 请求对象
     * @return AsyncInvoker<ListFunctionsRequest, ListFunctionsResponse>
     */
    public AsyncInvoker<ListFunctionsRequest, ListFunctionsResponse> listFunctionsAsyncInvoker(
        ListFunctionsRequest request) {
        return new AsyncInvoker<ListFunctionsRequest, ListFunctionsResponse>(request, LakeFormationMeta.listFunctions,
            hcClient);
    }

    /**
     * 查询函数
     *
     * 根据函数名称查询函数信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFunctionRequest 请求对象
     * @return CompletableFuture<ShowFunctionResponse>
     */
    public CompletableFuture<ShowFunctionResponse> showFunctionAsync(ShowFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.showFunction);
    }

    /**
     * 查询函数
     *
     * 根据函数名称查询函数信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFunctionRequest 请求对象
     * @return AsyncInvoker<ShowFunctionRequest, ShowFunctionResponse>
     */
    public AsyncInvoker<ShowFunctionRequest, ShowFunctionResponse> showFunctionAsyncInvoker(
        ShowFunctionRequest request) {
        return new AsyncInvoker<ShowFunctionRequest, ShowFunctionResponse>(request, LakeFormationMeta.showFunction,
            hcClient);
    }

    /**
     * 修改函数属性
     *
     * 修改函数属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFunctionRequest 请求对象
     * @return CompletableFuture<UpdateFunctionResponse>
     */
    public CompletableFuture<UpdateFunctionResponse> updateFunctionAsync(UpdateFunctionRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.updateFunction);
    }

    /**
     * 修改函数属性
     *
     * 修改函数属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFunctionRequest 请求对象
     * @return AsyncInvoker<UpdateFunctionRequest, UpdateFunctionResponse>
     */
    public AsyncInvoker<UpdateFunctionRequest, UpdateFunctionResponse> updateFunctionAsyncInvoker(
        UpdateFunctionRequest request) {
        return new AsyncInvoker<UpdateFunctionRequest, UpdateFunctionResponse>(request,
            LakeFormationMeta.updateFunction, hcClient);
    }

    /**
     * 注册租户协议
     *
     * 用户授权并委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAgreementRequest 请求对象
     * @return CompletableFuture<CreateAgreementResponse>
     */
    public CompletableFuture<CreateAgreementResponse> createAgreementAsync(CreateAgreementRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.createAgreement);
    }

    /**
     * 注册租户协议
     *
     * 用户授权并委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAgreementRequest 请求对象
     * @return AsyncInvoker<CreateAgreementRequest, CreateAgreementResponse>
     */
    public AsyncInvoker<CreateAgreementRequest, CreateAgreementResponse> createAgreementAsyncInvoker(
        CreateAgreementRequest request) {
        return new AsyncInvoker<CreateAgreementRequest, CreateAgreementResponse>(request,
            LakeFormationMeta.createAgreement, hcClient);
    }

    /**
     * 查询租户是否注册协议
     *
     * 查询租户当前协议和委托信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgreementRequest 请求对象
     * @return CompletableFuture<ShowAgreementResponse>
     */
    public CompletableFuture<ShowAgreementResponse> showAgreementAsync(ShowAgreementRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.showAgreement);
    }

    /**
     * 查询租户是否注册协议
     *
     * 查询租户当前协议和委托信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgreementRequest 请求对象
     * @return AsyncInvoker<ShowAgreementRequest, ShowAgreementResponse>
     */
    public AsyncInvoker<ShowAgreementRequest, ShowAgreementResponse> showAgreementAsyncInvoker(
        ShowAgreementRequest request) {
        return new AsyncInvoker<ShowAgreementRequest, ShowAgreementResponse>(request, LakeFormationMeta.showAgreement,
            hcClient);
    }

    /**
     * 查询当前系统协议
     *
     * 查询当前系统协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgreementRuleRequest 请求对象
     * @return CompletableFuture<ShowAgreementRuleResponse>
     */
    public CompletableFuture<ShowAgreementRuleResponse> showAgreementRuleAsync(ShowAgreementRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.showAgreementRule);
    }

    /**
     * 查询当前系统协议
     *
     * 查询当前系统协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAgreementRuleRequest 请求对象
     * @return AsyncInvoker<ShowAgreementRuleRequest, ShowAgreementRuleResponse>
     */
    public AsyncInvoker<ShowAgreementRuleRequest, ShowAgreementRuleResponse> showAgreementRuleAsyncInvoker(
        ShowAgreementRuleRequest request) {
        return new AsyncInvoker<ShowAgreementRuleRequest, ShowAgreementRuleResponse>(request,
            LakeFormationMeta.showAgreementRule, hcClient);
    }

    /**
     * 元数据数量统计
     *
     * 元数据数量统计接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountMetaObjRequest 请求对象
     * @return CompletableFuture<CountMetaObjResponse>
     */
    public CompletableFuture<CountMetaObjResponse> countMetaObjAsync(CountMetaObjRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.countMetaObj);
    }

    /**
     * 元数据数量统计
     *
     * 元数据数量统计接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CountMetaObjRequest 请求对象
     * @return AsyncInvoker<CountMetaObjRequest, CountMetaObjResponse>
     */
    public AsyncInvoker<CountMetaObjRequest, CountMetaObjResponse> countMetaObjAsyncInvoker(
        CountMetaObjRequest request) {
        return new AsyncInvoker<CountMetaObjRequest, CountMetaObjResponse>(request, LakeFormationMeta.countMetaObj,
            hcClient);
    }

    /**
     * 创建实例
     *
     * 创建一个LakeFormation实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLakeFormationInstanceRequest 请求对象
     * @return CompletableFuture<CreateLakeFormationInstanceResponse>
     */
    public CompletableFuture<CreateLakeFormationInstanceResponse> createLakeFormationInstanceAsync(
        CreateLakeFormationInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.createLakeFormationInstance);
    }

    /**
     * 创建实例
     *
     * 创建一个LakeFormation实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLakeFormationInstanceRequest 请求对象
     * @return AsyncInvoker<CreateLakeFormationInstanceRequest, CreateLakeFormationInstanceResponse>
     */
    public AsyncInvoker<CreateLakeFormationInstanceRequest, CreateLakeFormationInstanceResponse> createLakeFormationInstanceAsyncInvoker(
        CreateLakeFormationInstanceRequest request) {
        return new AsyncInvoker<CreateLakeFormationInstanceRequest, CreateLakeFormationInstanceResponse>(request,
            LakeFormationMeta.createLakeFormationInstance, hcClient);
    }

    /**
     * 删除实例
     *
     * 根据实例Id删除LakeFormation实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLakeFormationInstanceRequest 请求对象
     * @return CompletableFuture<DeleteLakeFormationInstanceResponse>
     */
    public CompletableFuture<DeleteLakeFormationInstanceResponse> deleteLakeFormationInstanceAsync(
        DeleteLakeFormationInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.deleteLakeFormationInstance);
    }

    /**
     * 删除实例
     *
     * 根据实例Id删除LakeFormation实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLakeFormationInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteLakeFormationInstanceRequest, DeleteLakeFormationInstanceResponse>
     */
    public AsyncInvoker<DeleteLakeFormationInstanceRequest, DeleteLakeFormationInstanceResponse> deleteLakeFormationInstanceAsyncInvoker(
        DeleteLakeFormationInstanceRequest request) {
        return new AsyncInvoker<DeleteLakeFormationInstanceRequest, DeleteLakeFormationInstanceResponse>(request,
            LakeFormationMeta.deleteLakeFormationInstance, hcClient);
    }

    /**
     * 查询实例列表
     *
     * 查询用户创建的实例列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLakeFormationInstancesRequest 请求对象
     * @return CompletableFuture<ListLakeFormationInstancesResponse>
     */
    public CompletableFuture<ListLakeFormationInstancesResponse> listLakeFormationInstancesAsync(
        ListLakeFormationInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listLakeFormationInstances);
    }

    /**
     * 查询实例列表
     *
     * 查询用户创建的实例列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLakeFormationInstancesRequest 请求对象
     * @return AsyncInvoker<ListLakeFormationInstancesRequest, ListLakeFormationInstancesResponse>
     */
    public AsyncInvoker<ListLakeFormationInstancesRequest, ListLakeFormationInstancesResponse> listLakeFormationInstancesAsyncInvoker(
        ListLakeFormationInstancesRequest request) {
        return new AsyncInvoker<ListLakeFormationInstancesRequest, ListLakeFormationInstancesResponse>(request,
            LakeFormationMeta.listLakeFormationInstances, hcClient);
    }

    /**
     * 恢复实例
     *
     * 从回收站恢复LakeFormation实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MoveLakeFormationInstanceOutRecycleBinRequest 请求对象
     * @return CompletableFuture<MoveLakeFormationInstanceOutRecycleBinResponse>
     */
    public CompletableFuture<MoveLakeFormationInstanceOutRecycleBinResponse> moveLakeFormationInstanceOutRecycleBinAsync(
        MoveLakeFormationInstanceOutRecycleBinRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.moveLakeFormationInstanceOutRecycleBin);
    }

    /**
     * 恢复实例
     *
     * 从回收站恢复LakeFormation实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MoveLakeFormationInstanceOutRecycleBinRequest 请求对象
     * @return AsyncInvoker<MoveLakeFormationInstanceOutRecycleBinRequest, MoveLakeFormationInstanceOutRecycleBinResponse>
     */
    public AsyncInvoker<MoveLakeFormationInstanceOutRecycleBinRequest, MoveLakeFormationInstanceOutRecycleBinResponse> moveLakeFormationInstanceOutRecycleBinAsyncInvoker(
        MoveLakeFormationInstanceOutRecycleBinRequest request) {
        return new AsyncInvoker<MoveLakeFormationInstanceOutRecycleBinRequest, MoveLakeFormationInstanceOutRecycleBinResponse>(
            request, LakeFormationMeta.moveLakeFormationInstanceOutRecycleBin, hcClient);
    }

    /**
     * 查询实例详情
     *
     * 使用实例Id查询LakeFormation实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLakeFormationInstanceRequest 请求对象
     * @return CompletableFuture<ShowLakeFormationInstanceResponse>
     */
    public CompletableFuture<ShowLakeFormationInstanceResponse> showLakeFormationInstanceAsync(
        ShowLakeFormationInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.showLakeFormationInstance);
    }

    /**
     * 查询实例详情
     *
     * 使用实例Id查询LakeFormation实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLakeFormationInstanceRequest 请求对象
     * @return AsyncInvoker<ShowLakeFormationInstanceRequest, ShowLakeFormationInstanceResponse>
     */
    public AsyncInvoker<ShowLakeFormationInstanceRequest, ShowLakeFormationInstanceResponse> showLakeFormationInstanceAsyncInvoker(
        ShowLakeFormationInstanceRequest request) {
        return new AsyncInvoker<ShowLakeFormationInstanceRequest, ShowLakeFormationInstanceResponse>(request,
            LakeFormationMeta.showLakeFormationInstance, hcClient);
    }

    /**
     * 更新实例
     *
     * 修改LakeFormation实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLakeFormationInstanceRequest 请求对象
     * @return CompletableFuture<UpdateLakeFormationInstanceResponse>
     */
    public CompletableFuture<UpdateLakeFormationInstanceResponse> updateLakeFormationInstanceAsync(
        UpdateLakeFormationInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.updateLakeFormationInstance);
    }

    /**
     * 更新实例
     *
     * 修改LakeFormation实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLakeFormationInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateLakeFormationInstanceRequest, UpdateLakeFormationInstanceResponse>
     */
    public AsyncInvoker<UpdateLakeFormationInstanceRequest, UpdateLakeFormationInstanceResponse> updateLakeFormationInstanceAsyncInvoker(
        UpdateLakeFormationInstanceRequest request) {
        return new AsyncInvoker<UpdateLakeFormationInstanceRequest, UpdateLakeFormationInstanceResponse>(request,
            LakeFormationMeta.updateLakeFormationInstance, hcClient);
    }

    /**
     * 查询OBS桶列表
     *
     * 查询OBS桶列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListObsBucketsRequest 请求对象
     * @return CompletableFuture<ListObsBucketsResponse>
     */
    public CompletableFuture<ListObsBucketsResponse> listObsBucketsAsync(ListObsBucketsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listObsBuckets);
    }

    /**
     * 查询OBS桶列表
     *
     * 查询OBS桶列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListObsBucketsRequest 请求对象
     * @return AsyncInvoker<ListObsBucketsRequest, ListObsBucketsResponse>
     */
    public AsyncInvoker<ListObsBucketsRequest, ListObsBucketsResponse> listObsBucketsAsyncInvoker(
        ListObsBucketsRequest request) {
        return new AsyncInvoker<ListObsBucketsRequest, ListObsBucketsResponse>(request,
            LakeFormationMeta.listObsBuckets, hcClient);
    }

    /**
     * 查询obs桶对象列表
     *
     * 查询obs桶对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListObsObjectRequest 请求对象
     * @return CompletableFuture<ListObsObjectResponse>
     */
    public CompletableFuture<ListObsObjectResponse> listObsObjectAsync(ListObsObjectRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listObsObject);
    }

    /**
     * 查询obs桶对象列表
     *
     * 查询obs桶对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListObsObjectRequest 请求对象
     * @return AsyncInvoker<ListObsObjectRequest, ListObsObjectResponse>
     */
    public AsyncInvoker<ListObsObjectRequest, ListObsObjectResponse> listObsObjectAsyncInvoker(
        ListObsObjectRequest request) {
        return new AsyncInvoker<ListObsObjectRequest, ListObsObjectResponse>(request, LakeFormationMeta.listObsObject,
            hcClient);
    }

    /**
     * 批量添加分区信息
     *
     * 批量添加分区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddPartitionsRequest 请求对象
     * @return CompletableFuture<AddPartitionsResponse>
     */
    public CompletableFuture<AddPartitionsResponse> addPartitionsAsync(AddPartitionsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.addPartitions);
    }

    /**
     * 批量添加分区信息
     *
     * 批量添加分区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddPartitionsRequest 请求对象
     * @return AsyncInvoker<AddPartitionsRequest, AddPartitionsResponse>
     */
    public AsyncInvoker<AddPartitionsRequest, AddPartitionsResponse> addPartitionsAsyncInvoker(
        AddPartitionsRequest request) {
        return new AsyncInvoker<AddPartitionsRequest, AddPartitionsResponse>(request, LakeFormationMeta.addPartitions,
            hcClient);
    }

    /**
     * 批量删除分区信息
     *
     * 非事务表：如果设置删除数据，立刻删除分区数据路径下的数据。
     * 事务表：如果设置删除数据，保留数据在原路径下但对外不可见，待数据超期后统一删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeletePartitionRequest 请求对象
     * @return CompletableFuture<BatchDeletePartitionResponse>
     */
    public CompletableFuture<BatchDeletePartitionResponse> batchDeletePartitionAsync(
        BatchDeletePartitionRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.batchDeletePartition);
    }

    /**
     * 批量删除分区信息
     *
     * 非事务表：如果设置删除数据，立刻删除分区数据路径下的数据。
     * 事务表：如果设置删除数据，保留数据在原路径下但对外不可见，待数据超期后统一删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeletePartitionRequest 请求对象
     * @return AsyncInvoker<BatchDeletePartitionRequest, BatchDeletePartitionResponse>
     */
    public AsyncInvoker<BatchDeletePartitionRequest, BatchDeletePartitionResponse> batchDeletePartitionAsyncInvoker(
        BatchDeletePartitionRequest request) {
        return new AsyncInvoker<BatchDeletePartitionRequest, BatchDeletePartitionResponse>(request,
            LakeFormationMeta.batchDeletePartition, hcClient);
    }

    /**
     * 批量清空列表信息
     *
     * 删除存在分区的数据及统计信息，保留分区的元数据信息。全部存在、部分存在或都不存在，均返回OK
     * 非事务表：立刻删除分区路径下的数据。
     * 事务表：数据保留但不可见，待被删除数据超期后统一删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeletePartitionedStatisticsRequest 请求对象
     * @return CompletableFuture<BatchDeletePartitionedStatisticsResponse>
     */
    public CompletableFuture<BatchDeletePartitionedStatisticsResponse> batchDeletePartitionedStatisticsAsync(
        BatchDeletePartitionedStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.batchDeletePartitionedStatistics);
    }

    /**
     * 批量清空列表信息
     *
     * 删除存在分区的数据及统计信息，保留分区的元数据信息。全部存在、部分存在或都不存在，均返回OK
     * 非事务表：立刻删除分区路径下的数据。
     * 事务表：数据保留但不可见，待被删除数据超期后统一删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeletePartitionedStatisticsRequest 请求对象
     * @return AsyncInvoker<BatchDeletePartitionedStatisticsRequest, BatchDeletePartitionedStatisticsResponse>
     */
    public AsyncInvoker<BatchDeletePartitionedStatisticsRequest, BatchDeletePartitionedStatisticsResponse> batchDeletePartitionedStatisticsAsyncInvoker(
        BatchDeletePartitionedStatisticsRequest request) {
        return new AsyncInvoker<BatchDeletePartitionedStatisticsRequest, BatchDeletePartitionedStatisticsResponse>(
            request, LakeFormationMeta.batchDeletePartitionedStatistics, hcClient);
    }

    /**
     * 批量获取分区信息
     *
     * 批量获取分区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchListPartitionByValuesRequest 请求对象
     * @return CompletableFuture<BatchListPartitionByValuesResponse>
     */
    public CompletableFuture<BatchListPartitionByValuesResponse> batchListPartitionByValuesAsync(
        BatchListPartitionByValuesRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.batchListPartitionByValues);
    }

    /**
     * 批量获取分区信息
     *
     * 批量获取分区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchListPartitionByValuesRequest 请求对象
     * @return AsyncInvoker<BatchListPartitionByValuesRequest, BatchListPartitionByValuesResponse>
     */
    public AsyncInvoker<BatchListPartitionByValuesRequest, BatchListPartitionByValuesResponse> batchListPartitionByValuesAsyncInvoker(
        BatchListPartitionByValuesRequest request) {
        return new AsyncInvoker<BatchListPartitionByValuesRequest, BatchListPartitionByValuesResponse>(request,
            LakeFormationMeta.batchListPartitionByValues, hcClient);
    }

    /**
     * 批量修改分区信息
     *
     * 所有partition必须要全部存在，如果存在某个partition不存在，就返回失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdatePartitionRequest 请求对象
     * @return CompletableFuture<BatchUpdatePartitionResponse>
     */
    public CompletableFuture<BatchUpdatePartitionResponse> batchUpdatePartitionAsync(
        BatchUpdatePartitionRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.batchUpdatePartition);
    }

    /**
     * 批量修改分区信息
     *
     * 所有partition必须要全部存在，如果存在某个partition不存在，就返回失败
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdatePartitionRequest 请求对象
     * @return AsyncInvoker<BatchUpdatePartitionRequest, BatchUpdatePartitionResponse>
     */
    public AsyncInvoker<BatchUpdatePartitionRequest, BatchUpdatePartitionResponse> batchUpdatePartitionAsyncInvoker(
        BatchUpdatePartitionRequest request) {
        return new AsyncInvoker<BatchUpdatePartitionRequest, BatchUpdatePartitionResponse>(request,
            LakeFormationMeta.batchUpdatePartition, hcClient);
    }

    /**
     * 列举分区值列表
     *
     * 遍历分区名字列表信息
     * 对于事务表，支持基于表的特定版本遍历分区名字列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartitionNamesRequest 请求对象
     * @return CompletableFuture<ListPartitionNamesResponse>
     */
    public CompletableFuture<ListPartitionNamesResponse> listPartitionNamesAsync(ListPartitionNamesRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listPartitionNames);
    }

    /**
     * 列举分区值列表
     *
     * 遍历分区名字列表信息
     * 对于事务表，支持基于表的特定版本遍历分区名字列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartitionNamesRequest 请求对象
     * @return AsyncInvoker<ListPartitionNamesRequest, ListPartitionNamesResponse>
     */
    public AsyncInvoker<ListPartitionNamesRequest, ListPartitionNamesResponse> listPartitionNamesAsyncInvoker(
        ListPartitionNamesRequest request) {
        return new AsyncInvoker<ListPartitionNamesRequest, ListPartitionNamesResponse>(request,
            LakeFormationMeta.listPartitionNames, hcClient);
    }

    /**
     * 列举分区信息
     *
     * 遍历指定数据表下的分区列表，对于事务表，支持基于表的特定版本遍历分区列表。
     * 当过滤条件不为空时，优先根据过滤条件筛选过滤，
     * 当过滤条件为空且分区值不为空时，再根据分区值筛选过滤，
     * 当过滤条件和分区值都为空时，返回指定数据表下所有分区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartitionsRequest 请求对象
     * @return CompletableFuture<ListPartitionsResponse>
     */
    public CompletableFuture<ListPartitionsResponse> listPartitionsAsync(ListPartitionsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listPartitions);
    }

    /**
     * 列举分区信息
     *
     * 遍历指定数据表下的分区列表，对于事务表，支持基于表的特定版本遍历分区列表。
     * 当过滤条件不为空时，优先根据过滤条件筛选过滤，
     * 当过滤条件为空且分区值不为空时，再根据分区值筛选过滤，
     * 当过滤条件和分区值都为空时，返回指定数据表下所有分区。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPartitionsRequest 请求对象
     * @return AsyncInvoker<ListPartitionsRequest, ListPartitionsResponse>
     */
    public AsyncInvoker<ListPartitionsRequest, ListPartitionsResponse> listPartitionsAsyncInvoker(
        ListPartitionsRequest request) {
        return new AsyncInvoker<ListPartitionsRequest, ListPartitionsResponse>(request,
            LakeFormationMeta.listPartitions, hcClient);
    }

    /**
     * 批量获取分区的列统计信息
     *
     * 批量获取分区的列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowPartitionColumnStatisticsRequest 请求对象
     * @return CompletableFuture<BatchShowPartitionColumnStatisticsResponse>
     */
    public CompletableFuture<BatchShowPartitionColumnStatisticsResponse> batchShowPartitionColumnStatisticsAsync(
        BatchShowPartitionColumnStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.batchShowPartitionColumnStatistics);
    }

    /**
     * 批量获取分区的列统计信息
     *
     * 批量获取分区的列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowPartitionColumnStatisticsRequest 请求对象
     * @return AsyncInvoker<BatchShowPartitionColumnStatisticsRequest, BatchShowPartitionColumnStatisticsResponse>
     */
    public AsyncInvoker<BatchShowPartitionColumnStatisticsRequest, BatchShowPartitionColumnStatisticsResponse> batchShowPartitionColumnStatisticsAsyncInvoker(
        BatchShowPartitionColumnStatisticsRequest request) {
        return new AsyncInvoker<BatchShowPartitionColumnStatisticsRequest, BatchShowPartitionColumnStatisticsResponse>(
            request, LakeFormationMeta.batchShowPartitionColumnStatistics, hcClient);
    }

    /**
     * 删除分区列的统计信息
     *
     * 删除分区列的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePartitionColumnStatisticsRequest 请求对象
     * @return CompletableFuture<DeletePartitionColumnStatisticsResponse>
     */
    public CompletableFuture<DeletePartitionColumnStatisticsResponse> deletePartitionColumnStatisticsAsync(
        DeletePartitionColumnStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.deletePartitionColumnStatistics);
    }

    /**
     * 删除分区列的统计信息
     *
     * 删除分区列的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePartitionColumnStatisticsRequest 请求对象
     * @return AsyncInvoker<DeletePartitionColumnStatisticsRequest, DeletePartitionColumnStatisticsResponse>
     */
    public AsyncInvoker<DeletePartitionColumnStatisticsRequest, DeletePartitionColumnStatisticsResponse> deletePartitionColumnStatisticsAsyncInvoker(
        DeletePartitionColumnStatisticsRequest request) {
        return new AsyncInvoker<DeletePartitionColumnStatisticsRequest, DeletePartitionColumnStatisticsResponse>(
            request, LakeFormationMeta.deletePartitionColumnStatistics, hcClient);
    }

    /**
     * 批量设置分区的统计信息
     *
     * 批量设置分区的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetPartitionColumnStatisticsRequest 请求对象
     * @return CompletableFuture<SetPartitionColumnStatisticsResponse>
     */
    public CompletableFuture<SetPartitionColumnStatisticsResponse> setPartitionColumnStatisticsAsync(
        SetPartitionColumnStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.setPartitionColumnStatistics);
    }

    /**
     * 批量设置分区的统计信息
     *
     * 批量设置分区的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetPartitionColumnStatisticsRequest 请求对象
     * @return AsyncInvoker<SetPartitionColumnStatisticsRequest, SetPartitionColumnStatisticsResponse>
     */
    public AsyncInvoker<SetPartitionColumnStatisticsRequest, SetPartitionColumnStatisticsResponse> setPartitionColumnStatisticsAsyncInvoker(
        SetPartitionColumnStatisticsRequest request) {
        return new AsyncInvoker<SetPartitionColumnStatisticsRequest, SetPartitionColumnStatisticsResponse>(request,
            LakeFormationMeta.setPartitionColumnStatistics, hcClient);
    }

    /**
     * 创建role
     *
     * 创建role
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRoleRequest 请求对象
     * @return CompletableFuture<CreateRoleResponse>
     */
    public CompletableFuture<CreateRoleResponse> createRoleAsync(CreateRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.createRole);
    }

    /**
     * 创建role
     *
     * 创建role
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRoleRequest 请求对象
     * @return AsyncInvoker<CreateRoleRequest, CreateRoleResponse>
     */
    public AsyncInvoker<CreateRoleRequest, CreateRoleResponse> createRoleAsyncInvoker(CreateRoleRequest request) {
        return new AsyncInvoker<CreateRoleRequest, CreateRoleResponse>(request, LakeFormationMeta.createRole, hcClient);
    }

    /**
     * 删除角色
     *
     * 删除指定角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRoleRequest 请求对象
     * @return CompletableFuture<DeleteRoleResponse>
     */
    public CompletableFuture<DeleteRoleResponse> deleteRoleAsync(DeleteRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.deleteRole);
    }

    /**
     * 删除角色
     *
     * 删除指定角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRoleRequest 请求对象
     * @return AsyncInvoker<DeleteRoleRequest, DeleteRoleResponse>
     */
    public AsyncInvoker<DeleteRoleRequest, DeleteRoleResponse> deleteRoleAsyncInvoker(DeleteRoleRequest request) {
        return new AsyncInvoker<DeleteRoleRequest, DeleteRoleResponse>(request, LakeFormationMeta.deleteRole, hcClient);
    }

    /**
     * 列举所有角色名
     *
     * 查询所有角色名字列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRoleNamesRequest 请求对象
     * @return CompletableFuture<ListRoleNamesResponse>
     */
    public CompletableFuture<ListRoleNamesResponse> listRoleNamesAsync(ListRoleNamesRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listRoleNames);
    }

    /**
     * 列举所有角色名
     *
     * 查询所有角色名字列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRoleNamesRequest 请求对象
     * @return AsyncInvoker<ListRoleNamesRequest, ListRoleNamesResponse>
     */
    public AsyncInvoker<ListRoleNamesRequest, ListRoleNamesResponse> listRoleNamesAsyncInvoker(
        ListRoleNamesRequest request) {
        return new AsyncInvoker<ListRoleNamesRequest, ListRoleNamesResponse>(request, LakeFormationMeta.listRoleNames,
            hcClient);
    }

    /**
     * 根据条件分页列举角色
     *
     * 返回所有角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRolesRequest 请求对象
     * @return CompletableFuture<ListRolesResponse>
     */
    public CompletableFuture<ListRolesResponse> listRolesAsync(ListRolesRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listRoles);
    }

    /**
     * 根据条件分页列举角色
     *
     * 返回所有角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRolesRequest 请求对象
     * @return AsyncInvoker<ListRolesRequest, ListRolesResponse>
     */
    public AsyncInvoker<ListRolesRequest, ListRolesResponse> listRolesAsyncInvoker(ListRolesRequest request) {
        return new AsyncInvoker<ListRolesRequest, ListRolesResponse>(request, LakeFormationMeta.listRoles, hcClient);
    }

    /**
     * 获取角色
     *
     * 获取角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRoleRequest 请求对象
     * @return CompletableFuture<ShowRoleResponse>
     */
    public CompletableFuture<ShowRoleResponse> showRoleAsync(ShowRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.showRole);
    }

    /**
     * 获取角色
     *
     * 获取角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRoleRequest 请求对象
     * @return AsyncInvoker<ShowRoleRequest, ShowRoleResponse>
     */
    public AsyncInvoker<ShowRoleRequest, ShowRoleResponse> showRoleAsyncInvoker(ShowRoleRequest request) {
        return new AsyncInvoker<ShowRoleRequest, ShowRoleResponse>(request, LakeFormationMeta.showRole, hcClient);
    }

    /**
     * 修改角色信息
     *
     * 修改角色信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRoleRequest 请求对象
     * @return CompletableFuture<UpdateRoleResponse>
     */
    public CompletableFuture<UpdateRoleResponse> updateRoleAsync(UpdateRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.updateRole);
    }

    /**
     * 修改角色信息
     *
     * 修改角色信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRoleRequest 请求对象
     * @return AsyncInvoker<UpdateRoleRequest, UpdateRoleResponse>
     */
    public AsyncInvoker<UpdateRoleRequest, UpdateRoleResponse> updateRoleAsyncInvoker(UpdateRoleRequest request) {
        return new AsyncInvoker<UpdateRoleRequest, UpdateRoleResponse>(request, LakeFormationMeta.updateRole, hcClient);
    }

    /**
     * 
     *
     * 查询规格列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSpecsRequest 请求对象
     * @return CompletableFuture<ListSpecsResponse>
     */
    public CompletableFuture<ListSpecsResponse> listSpecsAsync(ListSpecsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listSpecs);
    }

    /**
     * 
     *
     * 查询规格列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSpecsRequest 请求对象
     * @return AsyncInvoker<ListSpecsRequest, ListSpecsResponse>
     */
    public AsyncInvoker<ListSpecsRequest, ListSpecsResponse> listSpecsAsyncInvoker(ListSpecsRequest request) {
        return new AsyncInvoker<ListSpecsRequest, ListSpecsResponse>(request, LakeFormationMeta.listSpecs, hcClient);
    }

    /**
     * 创建表
     *
     * 创建表操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTableRequest 请求对象
     * @return CompletableFuture<CreateTableResponse>
     */
    public CompletableFuture<CreateTableResponse> createTableAsync(CreateTableRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.createTable);
    }

    /**
     * 创建表
     *
     * 创建表操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTableRequest 请求对象
     * @return AsyncInvoker<CreateTableRequest, CreateTableResponse>
     */
    public AsyncInvoker<CreateTableRequest, CreateTableResponse> createTableAsyncInvoker(CreateTableRequest request) {
        return new AsyncInvoker<CreateTableRequest, CreateTableResponse>(request, LakeFormationMeta.createTable,
            hcClient);
    }

    /**
     * 清空表的数据
     *
     * 清空表以及表下所有分区的数据及统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAllTablesRequest 请求对象
     * @return CompletableFuture<DeleteAllTablesResponse>
     */
    public CompletableFuture<DeleteAllTablesResponse> deleteAllTablesAsync(DeleteAllTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.deleteAllTables);
    }

    /**
     * 清空表的数据
     *
     * 清空表以及表下所有分区的数据及统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteAllTablesRequest 请求对象
     * @return AsyncInvoker<DeleteAllTablesRequest, DeleteAllTablesResponse>
     */
    public AsyncInvoker<DeleteAllTablesRequest, DeleteAllTablesResponse> deleteAllTablesAsyncInvoker(
        DeleteAllTablesRequest request) {
        return new AsyncInvoker<DeleteAllTablesRequest, DeleteAllTablesResponse>(request,
            LakeFormationMeta.deleteAllTables, hcClient);
    }

    /**
     * 删除表
     *
     * 删除表及表下的分区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTableRequest 请求对象
     * @return CompletableFuture<DeleteTableResponse>
     */
    public CompletableFuture<DeleteTableResponse> deleteTableAsync(DeleteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.deleteTable);
    }

    /**
     * 删除表
     *
     * 删除表及表下的分区
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTableRequest 请求对象
     * @return AsyncInvoker<DeleteTableRequest, DeleteTableResponse>
     */
    public AsyncInvoker<DeleteTableRequest, DeleteTableResponse> deleteTableAsyncInvoker(DeleteTableRequest request) {
        return new AsyncInvoker<DeleteTableRequest, DeleteTableResponse>(request, LakeFormationMeta.deleteTable,
            hcClient);
    }

    /**
     * 分页获取表的描述信息
     *
     * 通过数据库通配符和表通配符，找到符合条件的表并返回表的描述信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableMetaRequest 请求对象
     * @return CompletableFuture<ListTableMetaResponse>
     */
    public CompletableFuture<ListTableMetaResponse> listTableMetaAsync(ListTableMetaRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listTableMeta);
    }

    /**
     * 分页获取表的描述信息
     *
     * 通过数据库通配符和表通配符，找到符合条件的表并返回表的描述信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableMetaRequest 请求对象
     * @return AsyncInvoker<ListTableMetaRequest, ListTableMetaResponse>
     */
    public AsyncInvoker<ListTableMetaRequest, ListTableMetaResponse> listTableMetaAsyncInvoker(
        ListTableMetaRequest request) {
        return new AsyncInvoker<ListTableMetaRequest, ListTableMetaResponse>(request, LakeFormationMeta.listTableMeta,
            hcClient);
    }

    /**
     * 列举库下所有表名
     *
     * 查询数据库下的所有表名字列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableNamesRequest 请求对象
     * @return CompletableFuture<ListTableNamesResponse>
     */
    public CompletableFuture<ListTableNamesResponse> listTableNamesAsync(ListTableNamesRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listTableNames);
    }

    /**
     * 列举库下所有表名
     *
     * 查询数据库下的所有表名字列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableNamesRequest 请求对象
     * @return AsyncInvoker<ListTableNamesRequest, ListTableNamesResponse>
     */
    public AsyncInvoker<ListTableNamesRequest, ListTableNamesResponse> listTableNamesAsyncInvoker(
        ListTableNamesRequest request) {
        return new AsyncInvoker<ListTableNamesRequest, ListTableNamesResponse>(request,
            LakeFormationMeta.listTableNames, hcClient);
    }

    /**
     * 根据条件分页列举表信息
     *
     * 返回数据库下符合查询条件的表的元数据信息，不支持事务操作
     * 当表名通配符或表类型不为空时，优先根据表名和类型筛选过滤
     * 当表名通配符或表类型为空时，再根据属性筛选过滤
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTablesRequest 请求对象
     * @return CompletableFuture<ListTablesResponse>
     */
    public CompletableFuture<ListTablesResponse> listTablesAsync(ListTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listTables);
    }

    /**
     * 根据条件分页列举表信息
     *
     * 返回数据库下符合查询条件的表的元数据信息，不支持事务操作
     * 当表名通配符或表类型不为空时，优先根据表名和类型筛选过滤
     * 当表名通配符或表类型为空时，再根据属性筛选过滤
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTablesRequest 请求对象
     * @return AsyncInvoker<ListTablesRequest, ListTablesResponse>
     */
    public AsyncInvoker<ListTablesRequest, ListTablesResponse> listTablesAsyncInvoker(ListTablesRequest request) {
        return new AsyncInvoker<ListTablesRequest, ListTablesResponse>(request, LakeFormationMeta.listTables, hcClient);
    }

    /**
     * 根据表名列举表信息
     *
     * 根据表名查询数据库下的表信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTablesByNameRequest 请求对象
     * @return CompletableFuture<ListTablesByNameResponse>
     */
    public CompletableFuture<ListTablesByNameResponse> listTablesByNameAsync(ListTablesByNameRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listTablesByName);
    }

    /**
     * 根据表名列举表信息
     *
     * 根据表名查询数据库下的表信息列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTablesByNameRequest 请求对象
     * @return AsyncInvoker<ListTablesByNameRequest, ListTablesByNameResponse>
     */
    public AsyncInvoker<ListTablesByNameRequest, ListTablesByNameResponse> listTablesByNameAsyncInvoker(
        ListTablesByNameRequest request) {
        return new AsyncInvoker<ListTablesByNameRequest, ListTablesByNameResponse>(request,
            LakeFormationMeta.listTablesByName, hcClient);
    }

    /**
     * 获取表信息
     *
     * 获取表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTableRequest 请求对象
     * @return CompletableFuture<ShowTableResponse>
     */
    public CompletableFuture<ShowTableResponse> showTableAsync(ShowTableRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.showTable);
    }

    /**
     * 获取表信息
     *
     * 获取表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTableRequest 请求对象
     * @return AsyncInvoker<ShowTableRequest, ShowTableResponse>
     */
    public AsyncInvoker<ShowTableRequest, ShowTableResponse> showTableAsyncInvoker(ShowTableRequest request) {
        return new AsyncInvoker<ShowTableRequest, ShowTableResponse>(request, LakeFormationMeta.showTable, hcClient);
    }

    /**
     * 修改表信息
     *
     * 修改表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTableRequest 请求对象
     * @return CompletableFuture<UpdateTableResponse>
     */
    public CompletableFuture<UpdateTableResponse> updateTableAsync(UpdateTableRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.updateTable);
    }

    /**
     * 修改表信息
     *
     * 修改表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTableRequest 请求对象
     * @return AsyncInvoker<UpdateTableRequest, UpdateTableResponse>
     */
    public AsyncInvoker<UpdateTableRequest, UpdateTableResponse> updateTableAsyncInvoker(UpdateTableRequest request) {
        return new AsyncInvoker<UpdateTableRequest, UpdateTableResponse>(request, LakeFormationMeta.updateTable,
            hcClient);
    }

    /**
     * 删除表的指定列统计信息
     *
     * 删除表的指定列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTableColumnStatisticsRequest 请求对象
     * @return CompletableFuture<DeleteTableColumnStatisticsResponse>
     */
    public CompletableFuture<DeleteTableColumnStatisticsResponse> deleteTableColumnStatisticsAsync(
        DeleteTableColumnStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.deleteTableColumnStatistics);
    }

    /**
     * 删除表的指定列统计信息
     *
     * 删除表的指定列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTableColumnStatisticsRequest 请求对象
     * @return AsyncInvoker<DeleteTableColumnStatisticsRequest, DeleteTableColumnStatisticsResponse>
     */
    public AsyncInvoker<DeleteTableColumnStatisticsRequest, DeleteTableColumnStatisticsResponse> deleteTableColumnStatisticsAsyncInvoker(
        DeleteTableColumnStatisticsRequest request) {
        return new AsyncInvoker<DeleteTableColumnStatisticsRequest, DeleteTableColumnStatisticsResponse>(request,
            LakeFormationMeta.deleteTableColumnStatistics, hcClient);
    }

    /**
     * 获取表的列统计信息
     *
     * 获取表的列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableColumnStatisticsRequest 请求对象
     * @return CompletableFuture<ListTableColumnStatisticsResponse>
     */
    public CompletableFuture<ListTableColumnStatisticsResponse> listTableColumnStatisticsAsync(
        ListTableColumnStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listTableColumnStatistics);
    }

    /**
     * 获取表的列统计信息
     *
     * 获取表的列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTableColumnStatisticsRequest 请求对象
     * @return AsyncInvoker<ListTableColumnStatisticsRequest, ListTableColumnStatisticsResponse>
     */
    public AsyncInvoker<ListTableColumnStatisticsRequest, ListTableColumnStatisticsResponse> listTableColumnStatisticsAsyncInvoker(
        ListTableColumnStatisticsRequest request) {
        return new AsyncInvoker<ListTableColumnStatisticsRequest, ListTableColumnStatisticsResponse>(request,
            LakeFormationMeta.listTableColumnStatistics, hcClient);
    }

    /**
     * 更新表的列统计信息
     *
     * 更新表的列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetTableColumnStatisticsRequest 请求对象
     * @return CompletableFuture<SetTableColumnStatisticsResponse>
     */
    public CompletableFuture<SetTableColumnStatisticsResponse> setTableColumnStatisticsAsync(
        SetTableColumnStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.setTableColumnStatistics);
    }

    /**
     * 更新表的列统计信息
     *
     * 更新表的列统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetTableColumnStatisticsRequest 请求对象
     * @return AsyncInvoker<SetTableColumnStatisticsRequest, SetTableColumnStatisticsResponse>
     */
    public AsyncInvoker<SetTableColumnStatisticsRequest, SetTableColumnStatisticsResponse> setTableColumnStatisticsAsyncInvoker(
        SetTableColumnStatisticsRequest request) {
        return new AsyncInvoker<SetTableColumnStatisticsRequest, SetTableColumnStatisticsResponse>(request,
            LakeFormationMeta.setTableColumnStatistics, hcClient);
    }

    /**
     * 批量创建列限制条件
     *
     * 批量创建表的列限制条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateConstraintRequest 请求对象
     * @return CompletableFuture<BatchCreateConstraintResponse>
     */
    public CompletableFuture<BatchCreateConstraintResponse> batchCreateConstraintAsync(
        BatchCreateConstraintRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.batchCreateConstraint);
    }

    /**
     * 批量创建列限制条件
     *
     * 批量创建表的列限制条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateConstraintRequest 请求对象
     * @return AsyncInvoker<BatchCreateConstraintRequest, BatchCreateConstraintResponse>
     */
    public AsyncInvoker<BatchCreateConstraintRequest, BatchCreateConstraintResponse> batchCreateConstraintAsyncInvoker(
        BatchCreateConstraintRequest request) {
        return new AsyncInvoker<BatchCreateConstraintRequest, BatchCreateConstraintResponse>(request,
            LakeFormationMeta.batchCreateConstraint, hcClient);
    }

    /**
     * 删除列限制条件
     *
     * 删除列限制条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConstraintRequest 请求对象
     * @return CompletableFuture<DeleteConstraintResponse>
     */
    public CompletableFuture<DeleteConstraintResponse> deleteConstraintAsync(DeleteConstraintRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.deleteConstraint);
    }

    /**
     * 删除列限制条件
     *
     * 删除列限制条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConstraintRequest 请求对象
     * @return AsyncInvoker<DeleteConstraintRequest, DeleteConstraintResponse>
     */
    public AsyncInvoker<DeleteConstraintRequest, DeleteConstraintResponse> deleteConstraintAsyncInvoker(
        DeleteConstraintRequest request) {
        return new AsyncInvoker<DeleteConstraintRequest, DeleteConstraintResponse>(request,
            LakeFormationMeta.deleteConstraint, hcClient);
    }

    /**
     * 获取列限制条件
     *
     * 若查询外键信息，需要在参数中填写被引用表的数据库名和表名。如：parent_db&#x3D;db1&amp;parent_tbl&#x3D;tbl1
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConstraintsRequest 请求对象
     * @return CompletableFuture<ListConstraintsResponse>
     */
    public CompletableFuture<ListConstraintsResponse> listConstraintsAsync(ListConstraintsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listConstraints);
    }

    /**
     * 获取列限制条件
     *
     * 若查询外键信息，需要在参数中填写被引用表的数据库名和表名。如：parent_db&#x3D;db1&amp;parent_tbl&#x3D;tbl1
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConstraintsRequest 请求对象
     * @return AsyncInvoker<ListConstraintsRequest, ListConstraintsResponse>
     */
    public AsyncInvoker<ListConstraintsRequest, ListConstraintsResponse> listConstraintsAsyncInvoker(
        ListConstraintsRequest request) {
        return new AsyncInvoker<ListConstraintsRequest, ListConstraintsResponse>(request,
            LakeFormationMeta.listConstraints, hcClient);
    }

    /**
     * 批量更新标签
     *
     * 为指定实例批量更新标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateLakeFormationInstanceTagsRequest 请求对象
     * @return CompletableFuture<BatchUpdateLakeFormationInstanceTagsResponse>
     */
    public CompletableFuture<BatchUpdateLakeFormationInstanceTagsResponse> batchUpdateLakeFormationInstanceTagsAsync(
        BatchUpdateLakeFormationInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.batchUpdateLakeFormationInstanceTags);
    }

    /**
     * 批量更新标签
     *
     * 为指定实例批量更新标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateLakeFormationInstanceTagsRequest 请求对象
     * @return AsyncInvoker<BatchUpdateLakeFormationInstanceTagsRequest, BatchUpdateLakeFormationInstanceTagsResponse>
     */
    public AsyncInvoker<BatchUpdateLakeFormationInstanceTagsRequest, BatchUpdateLakeFormationInstanceTagsResponse> batchUpdateLakeFormationInstanceTagsAsyncInvoker(
        BatchUpdateLakeFormationInstanceTagsRequest request) {
        return new AsyncInvoker<BatchUpdateLakeFormationInstanceTagsRequest, BatchUpdateLakeFormationInstanceTagsResponse>(
            request, LakeFormationMeta.batchUpdateLakeFormationInstanceTags, hcClient);
    }

    /**
     * 获取租户的用户组
     *
     * 获取租户的用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGroupsForDomainRequest 请求对象
     * @return CompletableFuture<ListGroupsForDomainResponse>
     */
    public CompletableFuture<ListGroupsForDomainResponse> listGroupsForDomainAsync(ListGroupsForDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, LakeFormationMeta.listGroupsForDomain);
    }

    /**
     * 获取租户的用户组
     *
     * 获取租户的用户组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGroupsForDomainRequest 请求对象
     * @return AsyncInvoker<ListGroupsForDomainRequest, ListGroupsForDomainResponse>
     */
    public AsyncInvoker<ListGroupsForDomainRequest, ListGroupsForDomainResponse> listGroupsForDomainAsyncInvoker(
        ListGroupsForDomainRequest request) {
        return new AsyncInvoker<ListGroupsForDomainRequest, ListGroupsForDomainResponse>(request,
            LakeFormationMeta.listGroupsForDomain, hcClient);
    }

}
