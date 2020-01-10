/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.apimanagement.v2019_01_01.ErrorResponseException;
import com.microsoft.azure.management.apimanagement.v2019_01_01.PolicyScopeContract;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in PolicySnippets.
 */
public class PolicySnippetsInner {
    /** The Retrofit service to perform REST calls. */
    private PolicySnippetsService service;
    /** The service client containing this operation class. */
    private ApiManagementClientImpl client;

    /**
     * Initializes an instance of PolicySnippetsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PolicySnippetsInner(Retrofit retrofit, ApiManagementClientImpl client) {
        this.service = retrofit.create(PolicySnippetsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PolicySnippets to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PolicySnippetsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.v2019_01_01.PolicySnippets listByService" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/policySnippets")
        Observable<Response<ResponseBody>> listByService(@Path("resourceGroupName") String resourceGroupName, @Path("serviceName") String serviceName, @Path("subscriptionId") String subscriptionId, @Query("scope") PolicyScopeContract scope, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists all policy snippets.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PolicySnippetsCollectionInner object if successful.
     */
    public PolicySnippetsCollectionInner listByService(String resourceGroupName, String serviceName) {
        return listByServiceWithServiceResponseAsync(resourceGroupName, serviceName).toBlocking().single().body();
    }

    /**
     * Lists all policy snippets.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PolicySnippetsCollectionInner> listByServiceAsync(String resourceGroupName, String serviceName, final ServiceCallback<PolicySnippetsCollectionInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByServiceWithServiceResponseAsync(resourceGroupName, serviceName), serviceCallback);
    }

    /**
     * Lists all policy snippets.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PolicySnippetsCollectionInner object
     */
    public Observable<PolicySnippetsCollectionInner> listByServiceAsync(String resourceGroupName, String serviceName) {
        return listByServiceWithServiceResponseAsync(resourceGroupName, serviceName).map(new Func1<ServiceResponse<PolicySnippetsCollectionInner>, PolicySnippetsCollectionInner>() {
            @Override
            public PolicySnippetsCollectionInner call(ServiceResponse<PolicySnippetsCollectionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all policy snippets.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PolicySnippetsCollectionInner object
     */
    public Observable<ServiceResponse<PolicySnippetsCollectionInner>> listByServiceWithServiceResponseAsync(String resourceGroupName, String serviceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final PolicyScopeContract scope = null;
        return service.listByService(resourceGroupName, serviceName, this.client.subscriptionId(), scope, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PolicySnippetsCollectionInner>>>() {
                @Override
                public Observable<ServiceResponse<PolicySnippetsCollectionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PolicySnippetsCollectionInner> clientResponse = listByServiceDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lists all policy snippets.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param scope Policy scope. Possible values include: 'Tenant', 'Product', 'Api', 'Operation', 'All'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PolicySnippetsCollectionInner object if successful.
     */
    public PolicySnippetsCollectionInner listByService(String resourceGroupName, String serviceName, PolicyScopeContract scope) {
        return listByServiceWithServiceResponseAsync(resourceGroupName, serviceName, scope).toBlocking().single().body();
    }

    /**
     * Lists all policy snippets.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param scope Policy scope. Possible values include: 'Tenant', 'Product', 'Api', 'Operation', 'All'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PolicySnippetsCollectionInner> listByServiceAsync(String resourceGroupName, String serviceName, PolicyScopeContract scope, final ServiceCallback<PolicySnippetsCollectionInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByServiceWithServiceResponseAsync(resourceGroupName, serviceName, scope), serviceCallback);
    }

    /**
     * Lists all policy snippets.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param scope Policy scope. Possible values include: 'Tenant', 'Product', 'Api', 'Operation', 'All'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PolicySnippetsCollectionInner object
     */
    public Observable<PolicySnippetsCollectionInner> listByServiceAsync(String resourceGroupName, String serviceName, PolicyScopeContract scope) {
        return listByServiceWithServiceResponseAsync(resourceGroupName, serviceName, scope).map(new Func1<ServiceResponse<PolicySnippetsCollectionInner>, PolicySnippetsCollectionInner>() {
            @Override
            public PolicySnippetsCollectionInner call(ServiceResponse<PolicySnippetsCollectionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all policy snippets.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param scope Policy scope. Possible values include: 'Tenant', 'Product', 'Api', 'Operation', 'All'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PolicySnippetsCollectionInner object
     */
    public Observable<ServiceResponse<PolicySnippetsCollectionInner>> listByServiceWithServiceResponseAsync(String resourceGroupName, String serviceName, PolicyScopeContract scope) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByService(resourceGroupName, serviceName, this.client.subscriptionId(), scope, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PolicySnippetsCollectionInner>>>() {
                @Override
                public Observable<ServiceResponse<PolicySnippetsCollectionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PolicySnippetsCollectionInner> clientResponse = listByServiceDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PolicySnippetsCollectionInner> listByServiceDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PolicySnippetsCollectionInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PolicySnippetsCollectionInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}