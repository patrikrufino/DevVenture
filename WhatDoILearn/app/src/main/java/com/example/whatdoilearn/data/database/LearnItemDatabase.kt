package com.example.whatdoilearn.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.whatdoilearn.entities.LearnedItem
import com.example.whatdoilearn.entities.UnderstandingLevel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Database(entities = [LearnedItem::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class LearnItemDatabase : RoomDatabase() {

    abstract fun learnedItemDao(): LearnedItemDao

    companion object {

        var INSTANCE: LearnItemDatabase? = null

        fun getDatabase(context: Context, scope: CoroutineScope): LearnItemDatabase {
            return INSTANCE ?: synchronized(this) {
                val database = Room.databaseBuilder(
                    context.applicationContext,
                    LearnItemDatabase::class.java,
                    "learned_item_database"
                ).addCallback(LearnedItemDatabaseCallback(scope)).build()
                INSTANCE = database
                database
            }
        }
    }

    private class LearnedItemDatabaseCallback(
        private val scope: CoroutineScope
    ) : RoomDatabase.Callback() {
        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)
            INSTANCE?.let {
                scope.launch {
                    populateDatabase(it.learnedItemDao())
                }
            }
        }

        private suspend fun populateDatabase(learnedItemDao: LearnedItemDao) {
            val items = getAll()
            learnedItemDao.insert(items)
        }

        fun getAll(): List<LearnedItem> {
            return listOf(
                LearnedItem(
                    name = "Kotlin",
                    description = "Linguagem kotlin para Android",
                    understandingLevel = UnderstandingLevel.HIGH
                ),
                LearnedItem(
                    name = "RecyclerView",
                    description = "A n??vel organizacional, o surgimento do com??rcio virtual ?? uma das consequ??ncias das regras de conduta normativas. Caros amigos, a ado????o de pol??ticas descentralizadoras facilita a cria????o dos n??veis de motiva????o departamental. O cuidado em identificar pontos cr??ticos na cont??nua expans??o de nossa atividade maximiza as possibilidades por conta dos paradigmas corporativos. ",
                    understandingLevel = UnderstandingLevel.MEDIUM
                ),
                LearnedItem(
                    name = "DataClass",
                    description = " Por outro lado, a complexidade dos estudos efetuados pode nos levar a considerar a reestrutura????o do sistema de forma????o de quadros que corresponde ??s necessidades. Do mesmo modo, o novo modelo estrutural aqui preconizado talvez venha a ressaltar a relatividade dos relacionamentos verticais entre as hierarquias. Todavia, o desenvolvimento cont??nuo de distintas formas de atua????o causa impacto indireto na reavalia????o dos procedimentos normalmente adotados. No entanto, n??o podemos esquecer que o desafiador cen??rio globalizado cumpre um papel essencial na formula????o das diretrizes de desenvolvimento para o futuro.\n" +
                            "\n" +
                            "          A certifica????o de metodologias que nos auxiliam a lidar com o julgamento imparcial das eventualidades representa uma abertura para a melhoria dos m??todos utilizados na avalia????o de resultados. Acima de tudo, ?? fundamental ressaltar que a revolu????o dos costumes deve passar por modifica????es independentemente dos ??ndices pretendidos. ?? importante questionar o quanto o in??cio da atividade geral de forma????o de atitudes auxilia a prepara????o e a composi????o das condi????es inegavelmente apropriadas. ",
                    understandingLevel = UnderstandingLevel.LOW
                ),
                LearnedItem(
                    name = "Life Cycle",
                    description = "Ciclo de vida de uma aplica????o Android",
                    understandingLevel = UnderstandingLevel.HIGH
                ),
                LearnedItem(
                    name = "Intent",
                    description = "Como usar intents",
                    understandingLevel = UnderstandingLevel.MEDIUM
                ),
                LearnedItem(
                    name = "Services",
                    description = "Service em  Android",
                    understandingLevel = UnderstandingLevel.MEDIUM
                ),
                LearnedItem(
                    name = "Content Provider",
                    description = "Dados com Contenct Provider",
                    understandingLevel = UnderstandingLevel.LOW
                ),
            )
        }
    }
}
