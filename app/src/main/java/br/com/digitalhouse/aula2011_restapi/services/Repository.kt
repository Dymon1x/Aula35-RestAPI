package br.com.digitalhouse.aula2011_restapi.services

import br.com.digitalhouse.aula2011_restapi.models.Aluno
import br.com.digitalhouse.aula2011_restapi.models.Mensagem
import br.com.digitalhouse.aula2011_restapi.models.Produtos
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface Service{
    //utilizando o retrofit
    @GET("sort/aluno")
    suspend fun getAlunoSortRepo(): Aluno

    @GET("alunos")
    suspend fun getAllAlunosRepo(): List<Aluno>

    @GET("produtos")
    suspend fun getProdutos() : Produtos

    @GET("produtos")
    suspend fun getAllProdutos(): Mensagem
}

val retrofit = Retrofit.Builder()
        .baseUrl("https://promoios.com.br/api/")
        .addConverterFactory(GsonConverterFactory.create()) //podendo usar o moshi ou gson
        .build()

val service: Service = retrofit.create(Service::class.java)