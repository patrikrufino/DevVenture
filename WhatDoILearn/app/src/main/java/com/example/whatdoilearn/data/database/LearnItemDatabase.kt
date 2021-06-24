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
        @Volatile
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

        private fun populateDatabase(learnedItemDao: LearnedItemDao) {
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
                    description = "A nível organizacional, o surgimento do comércio virtual é uma das consequências das regras de conduta normativas. Caros amigos, a adoção de políticas descentralizadoras facilita a criação dos níveis de motivação departamental. O cuidado em identificar pontos críticos na contínua expansão de nossa atividade maximiza as possibilidades por conta dos paradigmas corporativos. ",
                    understandingLevel = UnderstandingLevel.MEDIUM
                ),
                LearnedItem(
                    name = "DataClass",
                    description = " Por outro lado, a complexidade dos estudos efetuados pode nos levar a considerar a reestruturação do sistema de formação de quadros que corresponde às necessidades. Do mesmo modo, o novo modelo estrutural aqui preconizado talvez venha a ressaltar a relatividade dos relacionamentos verticais entre as hierarquias. Todavia, o desenvolvimento contínuo de distintas formas de atuação causa impacto indireto na reavaliação dos procedimentos normalmente adotados. No entanto, não podemos esquecer que o desafiador cenário globalizado cumpre um papel essencial na formulação das diretrizes de desenvolvimento para o futuro.\n" +
                            "\n" +
                            "          A certificação de metodologias que nos auxiliam a lidar com o julgamento imparcial das eventualidades representa uma abertura para a melhoria dos métodos utilizados na avaliação de resultados. Acima de tudo, é fundamental ressaltar que a revolução dos costumes deve passar por modificações independentemente dos índices pretendidos. É importante questionar o quanto o início da atividade geral de formação de atitudes auxilia a preparação e a composição das condições inegavelmente apropriadas. ",
                    understandingLevel = UnderstandingLevel.LOW
                ),
                LearnedItem(
                    name = "Life Cycle",
                    description = "Ciclo de vida de uma aplicação Android",
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
