package br.com.fiap.listadecompras

import androidx.room.Database
import androidx.room.RoomDatabase



/*
Esse trecho de código define uma classe de banco de dados usando a biblioteca Room,
 que é uma camada de abstração sobre o SQLite no Android
*/


/*
o argumento entities define quais entidades (tabelas) estão incluídas no banco de dados.
No caso, a entidade ItemModel representa uma tabela no banco.
*/


@Database(entities = [ItemModel::class], version = 1)
abstract class ItemDatabase:RoomDatabase() {

    abstract fun itemDao(): ItemDao
}
